package com.generator.service.impl;

import com.generator.entity.Book;
import com.generator.mapper.BookMapper;
import com.generator.service.IBookService;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
