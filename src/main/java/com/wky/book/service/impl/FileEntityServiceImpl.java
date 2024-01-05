package com.wky.book.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wky.book.domain.FileEntity;
import com.wky.book.mapper.FileEntityMapper;
import com.wky.book.service.IFileEntityService;
import org.springframework.stereotype.Service;

/**
 * @author : llk
 * @Date: 2024/1/4 17:12
 */
@Service
public class FileEntityServiceImpl extends ServiceImpl<FileEntityMapper, FileEntity> implements IFileEntityService {
}
