import axios from 'axios';

export default class axiosUtils {
  static get = (url: string, param?: any | null): any => {
    return axios.request({
      method: 'get',
      url: '/api' + url,
      params: param,
      paramsSerializer: (param) => {
        const params = new URLSearchParams();
        for (const key in param) {
          params.append(key, param[key]);
        }
        return params.toString();
      },
    });
  };

  static post = (url: string, data?: any): any => {
    return axios.request({
      method: 'post',
      url: '/api' + url,
      data: data,
    });
  };

  static put = (url: string, data?: any): any => {
    return axios.request({
      method: 'put',
      url: '/api' + url,
      data: data,
    });
  };

  static delete = (url: string, data?: any): any => {
    return axios.request({
      method: 'delete',
      url: '/api' + url,
      data: data,
    });
  };
}