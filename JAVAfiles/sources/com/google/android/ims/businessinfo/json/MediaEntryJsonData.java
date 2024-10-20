package com.google.android.ims.businessinfo.json;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aoop;
import defpackage.aoor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaEntryJsonData {

    @aoor(a = "custom-label")
    @aoop
    private String customLabel;

    @aoor(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
    @aoop
    private String label;

    @aoor(a = "media")
    @aoop
    private Media media;

    @aoor(a = "media-content")
    @aoop
    private String mediaContent;

    @aoor(a = "addr-uri-type")
    @aoop
    private String type;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Media {

        @aoor(a = "content")
        @aoop
        private String content;

        @aoor(a = "media-url")
        @aoop
        private String mediaUrl;

        @aoor(a = "url")
        @aoop
        private String url;

        private Media() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getContent() {
        Media media = this.media;
        if (media != null && media.content != null) {
            return this.media.content;
        }
        return "";
    }

    protected String getCustomLabel() {
        return this.customLabel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getLabel() {
        return this.label;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getMediaContent() {
        return this.mediaContent;
    }

    protected String getType() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getUrl() {
        Media media = this.media;
        if (media == null) {
            return null;
        }
        return !TextUtils.isEmpty(media.mediaUrl) ? this.media.mediaUrl : this.media.url;
    }

    public String toString() {
        return String.format("url: %s content: %s label: %s custom-label: %s media-content: %s addr-uri-type: %s", getUrl(), getContent(), this.label, this.customLabel, this.mediaContent, this.type);
    }
}
