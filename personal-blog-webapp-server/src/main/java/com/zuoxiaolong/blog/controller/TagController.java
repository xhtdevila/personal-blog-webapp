/*
 * Copyright (C) 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.blog.controller;

import com.zuoxiaolong.blog.service.TagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author xiaolongzuo
 */
@RestController
@RequestMapping("/tag")
public class TagController {

    @Resource
    private TagService tagService;

    @RequestMapping("/getHotTags")
    public List<Map<String, Object>> getHotTags() {
        return tagService.getHotTags();
    }

    @RequestMapping("/save")
    public Integer save(String tagName) {
        return tagService.save(tagName);
    }

    @RequestMapping("/getId")
    public Integer getId(String tagName) {
        return tagService.getId(tagName);
    }

    @RequestMapping("/deleteByArticleId")
    public boolean deleteByArticleId(Integer articleId) {
        return tagService.deleteByArticleId(articleId);
    }

    @RequestMapping("/getTags")
    public List<Map<String, Object>> getTags(Integer articleId) {
        return tagService.getTags(articleId);
    }

}
