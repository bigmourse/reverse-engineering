package com.generator.service.impl;

import com.generator.entity.Account;
import com.generator.mapper.AccountMapper;
import com.generator.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuanran
 * @since 2021-10-27
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
