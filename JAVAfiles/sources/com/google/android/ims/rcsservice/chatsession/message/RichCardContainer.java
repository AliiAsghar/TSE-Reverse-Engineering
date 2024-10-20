package com.google.android.ims.rcsservice.chatsession.message;

import defpackage.acyz;
import defpackage.aczd;
import defpackage.adom;
import defpackage.aoop;
import defpackage.xyl;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RichCardContainer {
    public static final acyz<Boolean> USE_REFACTORED_RICH_CARD_CONTAINER = aczd.a(145728364);
    private String extractedDescription;
    private String extractedTitle;

    @aoop
    public GeneralPurposeRichCard generalPurposeCard;

    @aoop
    public GeneralPurposeRichCardCarousel generalPurposeCardCarousel;
    private List<GeneralPurposeRichCard> generalPurposeCards;

    public boolean containsCarousel() {
        if (this.generalPurposeCardCarousel != null) {
            return true;
        }
        return false;
    }

    public boolean containsStandaloneCard() {
        if (this.generalPurposeCard != null) {
            return true;
        }
        return false;
    }

    public String getExtractedDescription() {
        return this.extractedDescription;
    }

    public String getExtractedTitle() {
        return this.extractedTitle;
    }

    public List<GeneralPurposeRichCard> getGeneralPurposeCards() {
        xyl.m(this.generalPurposeCards, "General purpose cards were requested but none were present.");
        List<GeneralPurposeRichCard> list = this.generalPurposeCards;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public GeneralPurposeRichCard getStandaloneCard() {
        if (((Boolean) USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue()) {
            if (containsStandaloneCard()) {
                return this.generalPurposeCard;
            }
            throw new IllegalStateException("There is no standalone card to return.");
        }
        List<GeneralPurposeRichCard> list = this.generalPurposeCards;
        if (list != null && list.size() > 0) {
            return this.generalPurposeCards.get(0);
        }
        throw new IllegalStateException("there is no card to return");
    }

    public boolean hasGeneralPurposeCard() {
        if (!adom.o(this.generalPurposeCards)) {
            return true;
        }
        return false;
    }

    public void setExtractedDescription(String str) {
        this.extractedDescription = str;
    }

    public void setExtractedTitle(String str) {
        this.extractedTitle = str;
    }

    public void setGeneralPurposeCards(List<GeneralPurposeRichCard> list) {
        this.generalPurposeCards = list;
    }
}
