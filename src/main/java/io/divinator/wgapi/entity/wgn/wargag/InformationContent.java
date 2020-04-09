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
 * Класс описывает сущьность "Информация о контенте" для метод-блока {@link io.divinator.wgapi.method.wgn.WargagMethod}
 *
 * @author Sergey Divin
 */
public final class InformationContent {

    @Key("account_id")
    private Object accountId;

    @Key("category_id")
    private Object categoryId;

    @Key("content_id")
    private int contentId;

    @Key("created_at")
    private int createdAt;

    @Key("description")
    private String description;

    @Key("media_preview_url")
    private String mediaPreviewUrl;

    @Key("media_url")
    private String mediaUrl;

    @Key("nickname")
    private String nickname;

    @Key("rating")
    private int rating;

    @Key("subject")
    private String subject;

    @Key("tag_id")
    private int tagId;

    @Key("type")
    private String type;

    @Key("wargag_url")
    private String wargagUrl;

    @Key("allowed_to_vote")
    private Object allowedToVote;

    @Key("author")
    private Author author;

    /**
     * Метод возвращает идентификатор автора публикации
     *
     * @return Идентификатор автора публикации
     */
    public int getAccountId() {
        return (int) accountId;
    }

    /**
     * Метод возвращает идентификатор категории контента
     *
     * @return Идентификатор категории контента
     */
    public int getCategoryId() {
        return (int) categoryId;
    }

    /**
     * Метод возвращает идентификатор публикации
     *
     * @return Идентификатор публикации
     */
    public int getContentId() {
        return contentId;
    }

    /**
     * Метод возвращает дату создания публикации в формате UNIX timestamp или ISO 8601
     *
     * @return Дата создания публикации в формате UNIX timestamp или ISO 8601
     */
    public int getCreatedAt() {
        return createdAt;
    }

    /**
     * Метод возвращает текст публикации
     *
     * @return Текст публикации
     */
    public String getDescription() {
        return description;
    }

    /**
     * Метод возвращает ссылку на предпросмотр изображения. Доступно только для контента picture.
     *
     * @return Ссылка на предпросмотр изображения. Доступно только для контента picture.
     */
    public String getMediaPreviewUrl() {
        return mediaPreviewUrl;
    }

    /**
     * Метод возвращает ссылку на картинку/видео
     *
     * @return Ссылка на картинку/видео
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Метод возвращает имя игрока
     *
     * @return Имя игрока
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Метод возвращает текущий рейтинг
     *
     * @return Текущий рейтинг
     */
    public int getRating() {
        return rating;
    }

    /**
     * Метод возвращает тему публикации
     *
     * @return Тема публикации
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Метод возвращает идентификатор тега
     *
     * @return Идентификатор тега
     */
    public int getTagId() {
        return tagId;
    }

    /**
     * Метод возвращает тип контента
     *
     * @return Тип контента
     */
    public String getType() {
        return type;
    }

    /**
     * Метод возвращает ссылку на оригинальную публикацию
     *
     * @return Ссылка на оригинальную публикацию
     */
    public String getWargagUrl() {
        return wargagUrl;
    }

    /**
     * Метод показывает возможность проголосовать за контент.
     * Данные доступны только при наличии действующего access_token для указанного аккаунта.
     *
     * @return Показывает возможность проголосовать за контент. True - возможно, false - невозможно.
     */
    public boolean isAllowedToVote() {
        return (boolean) allowedToVote;
    }

    /**
     * Метод возвращает автора контента
     *
     * @return Автор контента
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Класс описывает сущьность "Автора" для {@link InformationContent}
     */
    public static class Author {

        @Key("reputation")
        private int reputation;

        @Key("status")
        private String status;

        @Key("status_image")
        private String statusImage;

        /**
         * Метод возвращает репутацию автора
         *
         * @return Репутация автора
         */
        public int getReputation() {
            return reputation;
        }

        /**
         * Метод возвращает звание автора
         *
         * @return Звание автора
         */
        public String getStatus() {
            return status;
        }

        /**
         * Метод возвращает значок звания
         *
         * @return Значок звания
         */
        public String getStatusImage() {
            return statusImage;
        }
    }
}
