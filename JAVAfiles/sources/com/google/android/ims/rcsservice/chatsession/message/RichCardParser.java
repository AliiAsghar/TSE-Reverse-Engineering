package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import defpackage.aczp;
import defpackage.adom;
import defpackage.advr;
import defpackage.aonx;
import defpackage.aony;
import defpackage.aook;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RichCardParser {
    private RbmSpecificMessage message;
    private aonx parser;
    private final String rawData;

    public RichCardParser(String str) {
        this.rawData = str;
        aony aonyVar = new aony();
        aonyVar.b();
        this.parser = aonyVar.a();
    }

    private void extractTitleAndDescription() {
        RbmSpecificMessage rbmSpecificMessage = this.message;
        if (rbmSpecificMessage != null && rbmSpecificMessage.container != null) {
            if (((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue()) {
                if (!rbmSpecificMessage.container.hasGeneralPurposeCard()) {
                    return;
                }
            } else if (!rbmSpecificMessage.container.containsStandaloneCard() && !rbmSpecificMessage.container.containsCarousel()) {
                return;
            }
            GeneralPurposeRichCard generalPurposeRichCard = rbmSpecificMessage.container.getGeneralPurposeCards().get(0);
            GeneralPurposeRichCardContent generalPurposeRichCardContent = generalPurposeRichCard.content;
            if (generalPurposeRichCardContent != null) {
                rbmSpecificMessage.container.setExtractedTitle(generalPurposeRichCardContent.title);
                rbmSpecificMessage.container.setExtractedDescription(generalPurposeRichCard.content.description);
            }
        }
    }

    private static boolean hasValidMediaFilesInformation(GeneralPurposeRichCardMediaInfo generalPurposeRichCardMediaInfo, boolean z) {
        String str;
        if (generalPurposeRichCardMediaInfo == null) {
            return true;
        }
        if (TextUtils.isEmpty(generalPurposeRichCardMediaInfo.mediaUrl)) {
            advr.g("Media payload was not empty but media url was missing.", new Object[0]);
            return false;
        }
        String str2 = generalPurposeRichCardMediaInfo.mediaContentType;
        if (str2 != null && GeneralPurposeRichCardMediaInfo.supportedRichCardMediaTypes.contains(str2.toLowerCase())) {
            Long l = generalPurposeRichCardMediaInfo.mediaFileSize;
            if (l != null && l.longValue() >= 1) {
                if (!TextUtils.isEmpty(generalPurposeRichCardMediaInfo.thumbnailUrl)) {
                    String str3 = generalPurposeRichCardMediaInfo.thumbnailContentType;
                    if (str3 != null && GeneralPurposeRichCardMediaInfo.supportedMediaImageTypes.contains(str3.toLowerCase())) {
                        Long l2 = generalPurposeRichCardMediaInfo.thumbnailFileSize;
                        if (l2 == null || l2.longValue() < 1) {
                            advr.g("Thumbnail file size invalid: {%d}. Discarding message..", generalPurposeRichCardMediaInfo.thumbnailFileSize);
                            return false;
                        }
                    } else {
                        advr.g("Thumbnail content type unsupported: {%s}. Discarding message..", generalPurposeRichCardMediaInfo.thumbnailContentType);
                        return false;
                    }
                }
                if (!z || ((str = generalPurposeRichCardMediaInfo.height) != null && (TextUtils.equals(str, GeneralPurposeRichCardMediaInfo.IMAGE_HEIGHT_SHORT) || TextUtils.equals(generalPurposeRichCardMediaInfo.height, GeneralPurposeRichCardMediaInfo.IMAGE_HEIGHT_MEDIUM) || TextUtils.equals(generalPurposeRichCardMediaInfo.height, GeneralPurposeRichCardMediaInfo.IMAGE_HEIGHT_TALL)))) {
                    return true;
                }
                return false;
            }
            advr.g("Media file size invalid: {%d}. Discarding message..", generalPurposeRichCardMediaInfo.mediaFileSize);
            return false;
        }
        advr.g("Media content type unsupported: {%s}. Discarding message..", generalPurposeRichCardMediaInfo.mediaContentType);
        return false;
    }

    private static boolean isValidCarouselLayout(GeneralPurposeRichCardLayoutInfo generalPurposeRichCardLayoutInfo) {
        String str = generalPurposeRichCardLayoutInfo.cardOrientation;
        String str2 = generalPurposeRichCardLayoutInfo.cardWidth;
        if (!TextUtils.isEmpty(str) && !GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL.equals(str)) {
            return false;
        }
        if (!GeneralPurposeRichCardLayoutInfo.WIDTH_SMALL.equals(str2) && !GeneralPurposeRichCardLayoutInfo.WIDTH_MEDIUM.equals(str2)) {
            return false;
        }
        return true;
    }

    private static boolean isValidGeneralPurposeCard(RbmSpecificMessage rbmSpecificMessage) {
        GeneralPurposeRichCard generalPurposeRichCard;
        GeneralPurposeRichCardLayoutInfo generalPurposeRichCardLayoutInfo;
        if (rbmSpecificMessage != null && rbmSpecificMessage.container != null) {
            if (!((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue() || rbmSpecificMessage.container.containsStandaloneCard()) {
                if (((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue()) {
                    generalPurposeRichCard = rbmSpecificMessage.container.getStandaloneCard();
                } else {
                    generalPurposeRichCard = rbmSpecificMessage.container.generalPurposeCard;
                }
                if (generalPurposeRichCard != null && generalPurposeRichCard.content != null && (generalPurposeRichCardLayoutInfo = generalPurposeRichCard.layout) != null && isValidStandaloneLayout(generalPurposeRichCardLayoutInfo)) {
                    return hasValidMediaFilesInformation(generalPurposeRichCard.content.media, TextUtils.equals(generalPurposeRichCard.layout.cardOrientation, GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL));
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private static boolean isValidGeneralPurposeCardCarousel(RbmSpecificMessage rbmSpecificMessage) {
        GeneralPurposeRichCardCarousel generalPurposeRichCardCarousel;
        GeneralPurposeRichCardLayoutInfo generalPurposeRichCardLayoutInfo;
        if (rbmSpecificMessage == null || rbmSpecificMessage.container == null || ((((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue() && !rbmSpecificMessage.container.containsCarousel()) || (generalPurposeRichCardCarousel = rbmSpecificMessage.container.generalPurposeCardCarousel) == null || adom.o(generalPurposeRichCardCarousel.contents) || (generalPurposeRichCardLayoutInfo = generalPurposeRichCardCarousel.layout) == null || !isValidCarouselLayout(generalPurposeRichCardLayoutInfo))) {
            return false;
        }
        ArrayList<GeneralPurposeRichCardContent> arrayList = generalPurposeRichCardCarousel.contents;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean hasValidMediaFilesInformation = hasValidMediaFilesInformation(arrayList.get(i).media, true);
            i++;
            if (!hasValidMediaFilesInformation) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidStandaloneLayout(GeneralPurposeRichCardLayoutInfo generalPurposeRichCardLayoutInfo) {
        String str = generalPurposeRichCardLayoutInfo.cardOrientation;
        String str2 = generalPurposeRichCardLayoutInfo.imageAlignment;
        if (GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL.equals(str)) {
            return true;
        }
        if (!GeneralPurposeRichCardLayoutInfo.ORIENTATION_HORIZONTAL.equals(str)) {
            return false;
        }
        if (GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT.equals(str2) || GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT.equals(str2)) {
            return true;
        }
        return false;
    }

    RbmSpecificMessage getMessage() {
        return this.message;
    }

    public RichCardContainer parse() {
        return parse(false);
    }

    public RichCardContainer parse(boolean z) {
        GeneralPurposeRichCard generalPurposeRichCard;
        if (TextUtils.isEmpty(this.rawData)) {
            return null;
        }
        String str = this.rawData;
        if (!aczp.n() && !aczp.d()) {
            advr.k("Both, Rich Cards and Rich Card carousels are disabled, discarding message.", new Object[0]);
            return null;
        }
        try {
            RbmSpecificMessage rbmSpecificMessage = (RbmSpecificMessage) this.parser.i(str, RbmSpecificMessage.class);
            this.message = rbmSpecificMessage;
            if (!isValidGeneralPurposeCard(rbmSpecificMessage) && !isValidGeneralPurposeCardCarousel(this.message)) {
                advr.g("Incoming Rich Card data is not valid.", new Object[0]);
                return null;
            }
            RichCardContainer richCardContainer = this.message.container;
            if (richCardContainer.containsStandaloneCard()) {
                if (!aczp.n()) {
                    advr.k("Discarding incoming standalone Rich Card since feature is disabled.", new Object[0]);
                    return null;
                }
                if (((Boolean) RichCardContainer.USE_REFACTORED_RICH_CARD_CONTAINER.a()).booleanValue()) {
                    generalPurposeRichCard = richCardContainer.getStandaloneCard();
                } else {
                    generalPurposeRichCard = richCardContainer.generalPurposeCard;
                }
                richCardContainer.setGeneralPurposeCards(Collections.singletonList(generalPurposeRichCard));
            } else if (richCardContainer.containsCarousel()) {
                if (!aczp.d()) {
                    advr.k("Discarding incoming Rich Card carousel since feature is disabled.", new Object[0]);
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                GeneralPurposeRichCardCarousel generalPurposeRichCardCarousel = richCardContainer.generalPurposeCardCarousel;
                generalPurposeRichCardCarousel.layout.cardOrientation = GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL;
                ArrayList<GeneralPurposeRichCardContent> arrayList2 = generalPurposeRichCardCarousel.contents;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    GeneralPurposeRichCardContent generalPurposeRichCardContent = arrayList2.get(i);
                    GeneralPurposeRichCard generalPurposeRichCard2 = new GeneralPurposeRichCard();
                    generalPurposeRichCard2.layout = richCardContainer.generalPurposeCardCarousel.layout;
                    generalPurposeRichCard2.content = generalPurposeRichCardContent;
                    arrayList.add(generalPurposeRichCard2);
                }
                richCardContainer.setGeneralPurposeCards(arrayList);
            }
            if (z) {
                extractTitleAndDescription();
            }
            Iterator<GeneralPurposeRichCard> it = richCardContainer.getGeneralPurposeCards().iterator();
            while (it.hasNext()) {
                ArrayList<ConversationSuggestion> arrayList3 = it.next().content.suggestions;
                if (!adom.o(arrayList3)) {
                    arrayList3.removeAll(Collections.singleton(null));
                }
            }
            return richCardContainer;
        } catch (aook e) {
            advr.i(e, "Unable to parse incoming Rich Card.", new Object[0]);
            return null;
        }
    }
}
