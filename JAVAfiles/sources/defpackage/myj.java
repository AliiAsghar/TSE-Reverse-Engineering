package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardCarousel;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import com.google.android.ims.rcsservice.chatsession.message.RichCardContainer;
import com.google.android.ims.rcsservice.chatsession.message.RichCardParser;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myj {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory");
    public final rtb b;
    public final obm c;
    private final mxg d;
    private final Context e;
    private final rvx f;
    private final orj g;
    private final pkg h;
    private final pej i;
    private final pek j;
    private final pid k;
    private final pkl l;
    private final piz m;
    private final lru n;
    private final lru o;

    public myj(Context context, rtb rtbVar, lru lruVar, mxg mxgVar, rvx rvxVar, orj orjVar, obm obmVar, pkg pkgVar, pek pekVar, pej pejVar, lru lruVar2, pid pidVar, pkl pklVar, piz pizVar) {
        this.e = context;
        this.b = rtbVar;
        this.o = lruVar;
        this.d = mxgVar;
        this.f = rvxVar;
        this.g = orjVar;
        this.c = obmVar;
        this.h = pkgVar;
        this.j = pekVar;
        this.i = pejVar;
        this.n = lruVar2;
        this.k = pidVar;
        this.l = pklVar;
        this.m = pizVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r2.startsWith("mms") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x003a, code lost:
    
        if (r21.bn() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.mxf f(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r20, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r21, defpackage.mzx r22) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myj.f(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, mzx):mxf");
    }

    private final mya g(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        mxg mxgVar = this.d;
        String U = messagePartData.U();
        Uri a2 = mxgVar.a(messagePartData.t(), messagePartData.v());
        alvw g = a.g();
        g.X(alwp.a, "BugleMapi");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createUnsupportedContent", 677, "CoreBugleContentFactory.java")).K("Attachment is UnsupportedContent messageId=%s status=%x contentType=%s uri=%s", bindData.A().a(), Integer.valueOf(bindData.q()), U, a2);
        if (U == null) {
            U = "*/*";
        }
        pa a3 = mya.a();
        a3.a = U;
        a3.c = t(bindData, messagePartData);
        a3.k(a2);
        return a3.j();
    }

    private final myn h(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        return a(bindData, messagePartData, null);
    }

    private final myn i(MessagesTable.BindData bindData, alog alogVar, int i) {
        return (myn) Collection.EL.stream(alogVar).filter(new myg(i, 0)).findFirst().map(new mut(this, bindData, 2, null)).orElse(null);
    }

    private final myr j(MessagePartData messagePartData) {
        int i;
        String p = p(messagePartData.ad());
        if (p != null) {
            try {
                wrj j = wcm.j(p);
                Context context = this.e;
                mzr c = mxu.c();
                wri wriVar = j.c;
                if (wriVar == null) {
                    wriVar = wri.a;
                }
                wrh b = wrh.b(wriVar.c);
                if (b == null) {
                    b = wrh.UNRECOGNIZED;
                }
                if (b == wrh.HELP_NOT_LONGER_NEED) {
                    i = R.string.end_of_emergency_help_not_needed;
                } else {
                    i = R.string.end_of_emergency_help_needed;
                }
                c.c(context.getString(i));
                return c.a();
            } catch (woz e) {
                throw new IllegalStateException("Text in end of emergency content is malformed", e);
            }
        }
        throw new IllegalStateException("Text in end of emergency content cannot be null.");
    }

    private static myr k(String str, mzx mzxVar) {
        mzr c = mxu.c();
        c.c(str);
        c.b(mzxVar.d);
        return c.a();
    }

    private static myr l(GeneralPurposeRichCard generalPurposeRichCard, mzx mzxVar) {
        if (albo.ah(generalPurposeRichCard.content.description)) {
            return null;
        }
        return k(generalPurposeRichCard.content.description, mzxVar);
    }

    private static myr m(GeneralPurposeRichCard generalPurposeRichCard, mzx mzxVar) {
        if (albo.ah(generalPurposeRichCard.content.title)) {
            return null;
        }
        return k(generalPurposeRichCard.content.title, mzxVar);
    }

    private static alog n(MessagesTable.BindData bindData, GeneralPurposeRichCard generalPurposeRichCard) {
        ArrayList<ConversationSuggestion> arrayList = generalPurposeRichCard.content.suggestions;
        if (arrayList == null) {
            int i = alog.d;
            return alsx.a;
        }
        Stream filter = Collection.EL.stream(arrayList).map(new myi(bindData)).filter(new mmd(18));
        int i2 = alog.d;
        return (alog) filter.collect(alls.a);
    }

    private static Optional o(alog alogVar, int i) {
        return Collection.EL.stream(alogVar).filter(new myg(i, 1)).findFirst();
    }

    private static String p(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\u0000", "");
    }

    private static boolean q(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        int q = bindData.q();
        int k = bindData.k();
        if (k != 0) {
            if (k == 2) {
                return true;
            }
            if (k != 3) {
                return false;
            }
            if ((!r(q) && bindData.r() > 0) || !messagePartData.aV()) {
                return false;
            }
            return true;
        }
        if (bindData.s() == -1) {
            return false;
        }
        if (!r(q) && bindData.r() > 0) {
            return false;
        }
        return true;
    }

    private static boolean r(int i) {
        if (!d.y(i) && !d.z(i)) {
            return false;
        }
        return true;
    }

    private final boolean s(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        if (bindData.k() == 3) {
            return false;
        }
        if (this.i.a()) {
            if (!q(bindData, messagePartData) || rvx.h(bindData.q())) {
                return false;
            }
            return true;
        }
        if (!q(bindData, messagePartData) || !this.f.c(this.e, bindData.q())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.myz t(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r8, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r9) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myj.t(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData):myz");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (r7 != 5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mxq a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r24, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myj.a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, java.lang.String):mxq");
    }

    public final mye b(final MessagesTable.BindData bindData, alog alogVar, final mzx mzxVar) {
        mxn mxnVar;
        int i;
        Stream stream = Collection.EL.stream(alogVar);
        rtb rtbVar = this.b;
        rtbVar.getClass();
        Stream map = stream.map(new mvp(rtbVar, 6));
        int i2 = alog.d;
        final alog alogVar2 = (alog) map.collect(alls.a);
        Optional findFirst = Collection.EL.stream(alogVar2).filter(new mmd(15)).findFirst();
        d.t(findFirst.isPresent(), "RBM rich card JSON is not present in parts.");
        RichCardContainer parse = new RichCardParser(((MessagePartData) findFirst.get()).ad()).parse();
        parse.getClass();
        int i3 = 2;
        char c = 65535;
        if (parse.containsStandaloneCard()) {
            if (parse.generalPurposeCard.layout.cardOrientation.equals(GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL)) {
                return e(bindData, alogVar2, 0, parse.generalPurposeCard, mzxVar);
            }
            if (parse.generalPurposeCard.layout.cardOrientation.equals(GeneralPurposeRichCardLayoutInfo.ORIENTATION_HORIZONTAL)) {
                GeneralPurposeRichCard generalPurposeRichCard = parse.generalPurposeCard;
                myr m = m(generalPurposeRichCard, mzxVar);
                myr l = l(generalPurposeRichCard, mzxVar);
                Optional o = o(alogVar2, 0);
                if (o.isEmpty()) {
                    mxnVar = null;
                } else {
                    mxnVar = new mxn(new mxr(Long.valueOf(((MessagePartData) o.get()).p()), i(bindData, alogVar2, 0), h(bindData, (MessagePartData) o.get()), Long.parseLong(((MessagePartData) o.get()).Z())));
                }
                alog n = n(bindData, generalPurposeRichCard);
                String str = generalPurposeRichCard.layout.imageAlignment;
                d.t(!albo.ah(str), "Image alignment must be provided for a horizontal card carousel.");
                int hashCode = str.hashCode();
                if (hashCode != 2332679) {
                    if (hashCode == 77974012 && str.equals(GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT)) {
                        c = 1;
                    }
                } else if (str.equals(GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT)) {
                    c = 0;
                }
                if (c != 0) {
                    if (c == 1) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Unexpected image alignment: ".concat(String.valueOf(str)));
                    }
                } else {
                    i = 1;
                }
                return new mxo(m, l, mxnVar, n, i);
            }
        } else if (parse.containsCarousel()) {
            final GeneralPurposeRichCardCarousel generalPurposeRichCardCarousel = parse.generalPurposeCardCarousel;
            alog alogVar3 = (alog) IntStream.CC.range(0, generalPurposeRichCardCarousel.contents.size()).mapToObj(new IntFunction() { // from class: myf
                @Override // java.util.function.IntFunction
                public final Object apply(int i4) {
                    GeneralPurposeRichCard generalPurposeRichCard2 = new GeneralPurposeRichCard();
                    GeneralPurposeRichCardCarousel generalPurposeRichCardCarousel2 = generalPurposeRichCardCarousel;
                    generalPurposeRichCard2.layout = generalPurposeRichCardCarousel2.layout;
                    generalPurposeRichCard2.content = generalPurposeRichCardCarousel2.contents.get(i4);
                    return myj.this.e(bindData, alogVar2, i4, generalPurposeRichCard2, mzxVar);
                }
            }).collect(alls.a);
            String str2 = generalPurposeRichCardCarousel.layout.cardWidth;
            d.t(!albo.ah(str2), "Card width must be provided for a rich card carousel.");
            int hashCode2 = str2.hashCode();
            if (hashCode2 != -1747407794) {
                if (hashCode2 == -1423642532 && str2.equals(GeneralPurposeRichCardLayoutInfo.WIDTH_MEDIUM)) {
                    c = 1;
                }
            } else if (str2.equals(GeneralPurposeRichCardLayoutInfo.WIDTH_SMALL)) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    throw new IllegalArgumentException("Unexpected card width: ".concat(String.valueOf(str2)));
                }
            } else {
                i3 = 1;
            }
            return new mxt(alogVar3, i3);
        }
        throw new IllegalStateException("Unexpected rich card type.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mym c(MessagesTable.BindData bindData, alog alogVar, mzx mzxVar) {
        String str;
        if (alogVar.isEmpty()) {
            alvw i = a.i();
            i.X(alwp.a, "BugleMapi");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "create", 175, "CoreBugleContentFactory.java")).r("Message without any associated part. status=%x", bindData.q());
            pa a2 = mya.a();
            a2.a = "*/*";
            a2.k(Uri.EMPTY);
            return a2.j();
        }
        if (alogVar.size() > 1) {
            if (this.c.a() && Collection.EL.stream(alogVar).anyMatch(new mmd(17))) {
                return b(bindData, alogVar, mzxVar);
            }
            alob alobVar = new alob();
            String str2 = null;
            for (int i2 = 0; i2 < alogVar.size(); i2++) {
                MessagePartData g = this.b.g((PartsTable.BindData) alogVar.get(i2));
                if (g.bw()) {
                    str = p(g.ad());
                } else {
                    if (this.g.a() && g.be()) {
                        try {
                            str = ((mxu) j(g)).a;
                        } catch (IllegalStateException e) {
                            alvw i3 = a.i();
                            i3.X(alwp.a, "BugleMapi");
                            ((alvg) ((alvg) ((alvg) i3).g(e)).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "create", (char) 201, "CoreBugleContentFactory.java")).q("Failed to create end of emergency content");
                            alobVar.h(g(bindData, g));
                        }
                    } else {
                        alobVar.h(f(bindData, g, mzxVar));
                    }
                }
                str2 = str;
            }
            alog g2 = alobVar.g();
            if (g2 != null) {
                return new mxs(g2, str2);
            }
            throw new NullPointerException("Null attachments");
        }
        return d(bindData, this.b.g((PartsTable.BindData) alogVar.get(0)), mzxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mym d(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r11, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r12, defpackage.mzx r13) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myj.d(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, mzx):mym");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.myc e(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r11, defpackage.alog r12, int r13, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard r14, defpackage.mzx r15) {
        /*
            r10 = this;
            myc r0 = new myc
            myr r1 = m(r14, r15)
            myr r15 = l(r14, r15)
            j$.util.Optional r2 = o(r12, r13)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L17
            r12 = 0
            goto Lab
        L17:
            java.lang.Object r3 = r2.get()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r3 = (com.google.android.apps.messaging.shared.datamodel.data.MessagePartData) r3
            myn r7 = r10.h(r11, r3)
            myn r6 = r10.i(r11, r12, r13)
            myb r12 = new myb
            mxr r13 = new mxr
            java.lang.Object r3 = r2.get()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r3 = (com.google.android.apps.messaging.shared.datamodel.data.MessagePartData) r3
            long r3 = r3.p()
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r2 = (com.google.android.apps.messaging.shared.datamodel.data.MessagePartData) r2
            java.lang.String r2 = r2.Z()
            long r8 = java.lang.Long.parseLong(r2)
            r4 = r13
            r4.<init>(r5, r6, r7, r8)
            com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardContent r2 = r14.content
            com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo r2 = r2.media
            java.lang.String r2 = r2.height
            boolean r3 = defpackage.albo.ah(r2)
            r4 = 1
            r3 = r3 ^ r4
            java.lang.String r5 = "Media height must be provided for a vertical rich card."
            defpackage.d.t(r3, r5)
            int r3 = r2.hashCode()
            r5 = -1616240335(0xffffffff9faa2131, float:-7.205271E-20)
            r6 = 0
            r7 = 2
            if (r3 == r5) goto L84
            r5 = -585750279(0xffffffffdd1628f9, float:-6.7626074E17)
            if (r3 == r5) goto L7a
            r5 = 1973327466(0x759e966a, float:4.020672E32)
            if (r3 == r5) goto L70
            goto L8e
        L70:
            java.lang.String r3 = "SHORT_HEIGHT"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L8e
            r3 = r6
            goto L8f
        L7a:
            java.lang.String r3 = "TALL_HEIGHT"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L8e
            r3 = r7
            goto L8f
        L84:
            java.lang.String r3 = "MEDIUM_HEIGHT"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L8e
            r3 = r4
            goto L8f
        L8e:
            r3 = -1
        L8f:
            if (r3 == 0) goto La8
            if (r3 == r4) goto La7
            if (r3 != r7) goto L97
            r4 = 3
            goto La8
        L97:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r6] = r2
            java.lang.String r13 = "Vertical rich card has an unexpected media height value: %s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        La7:
            r4 = r7
        La8:
            r12.<init>(r13, r4)
        Lab:
            alog r11 = n(r11, r14)
            r0.<init>(r1, r15, r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myj.e(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, alog, int, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard, mzx):myc");
    }
}
