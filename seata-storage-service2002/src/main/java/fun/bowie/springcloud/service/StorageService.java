package fun.bowie.springcloud.service;

public interface StorageService {
    /**
     * 减库存
     */
    void decrease(Long productId, Integer count);
}
