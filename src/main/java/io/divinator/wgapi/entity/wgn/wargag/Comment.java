/*
 * Copyright [2020] [Sergey Divin]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.divinator.wgapi.entity.wgn.wargag;

import com.google.api.client.util.Key;

/**
 * Класс описывает сущьность "Комментарий к контенту" для метод-блока {@link io.divinator.wgapi.method.wgn.WargagMethod}
 *
 * @author Sergey Divin
 */
public final class Comment {

    @Key("account_id")
    private int accountId;

    @Key("comment")
    private String comment;

    @Key("comment_id")
    private int commentId;

    @Key("content_id")
    private int contentId;

    @Key("created_at")
    private int createdAt;

    @Key("nickname")
    private String nickname;

    @Key("author")
    private InformationContent.Author author;

    /**
     * Метод возвращает идентификатор автора комментария
     * @return Идентификатор автора комментария
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Метод возвращает текст комментария
     * @return Текст комментария
     */
    public String getComment() {
        return comment;
    }

    /**
     * Метод возвращает идентификатор комментария
     * @return Идентификатор комментария
     */
    public int getCommentId() {
        return commentId;
    }

    /**
     * Метод возвращает идентификатор публикации
     * @return Идентификатор публикации
     */
    public int getContentId() {
        return contentId;
    }

    /**
     * Метод возвращает дата комментария
     * @return Дата комментария
     */
    public int getCreatedAt() {
        return createdAt;
    }

    /**
     * Метод возвращает имя игрока
     * @return Имя игрока
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Метод возвращает автора комментария {@link io.divinator.wgapi.entity.wgn.wargag.InformationContent.Author}
     * @return Автор комментария
     */
    public InformationContent.Author getAuthor() {
        return author;
    }
}