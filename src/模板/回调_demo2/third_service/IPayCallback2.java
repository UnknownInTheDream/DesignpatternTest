package 模板.回调_demo2.third_service;

/**
 * @author: tangliang
 * @date: 2020/4/10 13:20.
 * @description: XXX
 */
public interface IPayCallback2 {

    /**
     * 支付成功的回调处理
     *
     * @param uid
     * @param money
     * @param success
     */
    void processPaySuccess(long uid, long money, boolean success);
}
