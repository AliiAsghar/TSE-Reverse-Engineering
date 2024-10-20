package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import com.google.android.ims.rcsservice.chatsession.message.RichCardContainer;
import com.google.android.ims.rcsservice.chatsession.message.RichCardParser;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator");
    public final uja b;
    public final armf c;
    public final obm d;
    private final agnq e;
    private final rtb f;

    public rfr(uja ujaVar, agnq agnqVar, rtb rtbVar, armf armfVar, obm obmVar) {
        this.b = ujaVar;
        this.e = agnqVar;
        this.f = rtbVar;
        this.c = armfVar;
        this.d = obmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.rdc b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r18, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfr.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo, int, boolean):rdc");
    }

    public final void a(String str, MessageCoreData messageCoreData, boolean z) {
        RichCardContainer parse = new RichCardParser(str).parse(true);
        int i = 0;
        if (parse == null) {
            alvg alvgVar = (alvg) a.i();
            alvgVar.X(new alvz("json", String.class, false, false), yyb.bh(str));
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "addRichCardParts", 82, "RichCardMessagePartsCreator.java")).q("Rich Card parser failed to parse the incoming raw data.");
            return;
        }
        if (!TextUtils.isEmpty(parse.getExtractedTitle())) {
            messageCoreData.aH(this.f.c(parse.getExtractedTitle()));
        }
        if (!TextUtils.isEmpty(parse.getExtractedDescription())) {
            messageCoreData.aH(this.f.c(parse.getExtractedDescription()));
        }
        final rdc rdcVar = new rdc();
        if (parse.containsStandaloneCard()) {
            messageCoreData.aH(this.f.b(str, ameb.RICH_CARD));
            rdc b = b(messageCoreData, parse.getStandaloneCard().content.media, 0, z);
            if (b != null) {
                rdcVar.a(b);
            }
        } else if (parse.containsCarousel()) {
            messageCoreData.aH(this.f.b(str, ameb.RICH_CARD_CAROUSEL));
            Iterator<GeneralPurposeRichCard> it = parse.getGeneralPurposeCards().iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                rdc b2 = b(messageCoreData, it.next().content.media, i, z);
                if (b2 != null) {
                    rdcVar.a(b2);
                }
                i = i2;
            }
        }
        if (z) {
            this.e.h(new mla(14), null, new Runnable() { // from class: rfq
                /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2;
                    rfq rfqVar = this;
                    rdc rdcVar2 = rdcVar;
                    Iterator it3 = rdcVar2.a.iterator();
                    while (it3.hasNext()) {
                        rfr rfrVar = rfr.this;
                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it3.next();
                        if (messagePartCoreData.M() == ameb.RICH_CARD_THUMBNAIL) {
                            Integer num = (Integer) acpq.E().k().a();
                            int intValue = num.intValue();
                            if (!rfrVar.d.a() && messagePartCoreData.p() > intValue) {
                                alvg alvgVar2 = (alvg) rfr.a.g();
                                alvgVar2.X(new alvz("thumbnailSize", Long.class, false, false), Long.valueOf(messagePartCoreData.p()));
                                alvgVar2.X(new alvz("maximumAllowedSize", Long.class, false, false), num);
                                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardThumbnail", 295, "RichCardMessagePartsCreator.java")).q("Rich Card discarded due to oversized media thumbnail.");
                            } else {
                                Uri v = messagePartCoreData.v();
                                v.getClass();
                                alvg alvgVar3 = (alvg) rfr.a.g();
                                it2 = it3;
                                alvgVar3.X(new alvz("downloadUrl", String.class, false, false), v.toString());
                                alvgVar3.X(new alvz("expectedSize", Long.class, false, false), Long.valueOf(messagePartCoreData.p()));
                                alvgVar3.X(new alvz("maxThumbnailSize", Integer.class, false, false), num);
                                alvgVar3.X(new alvz("conversationId", String.class, false, false), messagePartCoreData.z().a());
                                alvgVar3.X(new alvz("messageId", String.class, false, false), messagePartCoreData.A().a());
                                ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardThumbnail", 316, "RichCardMessagePartsCreator.java")).q("Requesting thumbnail download");
                                uja ujaVar = rfrVar.b;
                                if (ujaVar != null) {
                                    ujaVar.a(messagePartCoreData, new uji[0]);
                                }
                            }
                        } else {
                            it2 = it3;
                            if (messagePartCoreData.M() == ameb.RICH_CARD_MEDIA) {
                                if (!rfrVar.d.a()) {
                                    long p = messagePartCoreData.p();
                                    yde d = ((zai) rfrVar.c.b()).d(p);
                                    long j = d.a;
                                    if (!d.a()) {
                                        alvg alvgVar4 = (alvg) rfr.a.g();
                                        alvgVar4.X(new alvz("mediaSize", Long.class, false, false), Long.valueOf(p));
                                        alvgVar4.X(new alvz("maxAutoDownloadSize", Long.class, false, false), Long.valueOf(j));
                                        alvgVar4.X(new alvz("reason", String.class, false, false), (String) d.b.orElse("<unspecified>"));
                                        ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardMedia", 338, "RichCardMessagePartsCreator.java")).q("Can not auto download Rich Card media");
                                    }
                                }
                                Uri v2 = messagePartCoreData.v();
                                v2.getClass();
                                alvg alvgVar5 = (alvg) rfr.a.g();
                                alvgVar5.X(new alvz("downloadUrl", String.class, false, false), v2.toString());
                                alvgVar5.X(new alvz("expectedSize", Long.class, false, false), Long.valueOf(messagePartCoreData.p()));
                                alvgVar5.X(new alvz("conversationId", String.class, false, false), messagePartCoreData.z().a());
                                alvgVar5.X(new alvz("messageId", String.class, false, false), messagePartCoreData.A().a());
                                ((alvg) alvgVar5.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardMedia", 358, "RichCardMessagePartsCreator.java")).q("Requesting media download");
                                uja ujaVar2 = rfrVar.b;
                                if (ujaVar2 != null) {
                                    ujaVar2.a(messagePartCoreData, new uji[0]);
                                }
                            }
                        }
                        rfqVar = this;
                        it3 = it2;
                    }
                    rdcVar2.a.clear();
                }
            });
        }
    }
}
