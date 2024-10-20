package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfq extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfq(Object obj, Object obj2, Uri uri, int i) {
        super(0);
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v56, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r1v14, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v15, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r7v19, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [jha, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r9v11, types: [nbd, nbg] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        boolean booleanValue;
        String str;
        aetn aesvVar;
        switch (this.d) {
            case 0:
                ?? r8 = this.c;
                Object obj = this.b;
                jfr jfrVar = (jfr) this.a;
                qjh.l(jfrVar.b, null, new gvr(jfrVar, (alog) obj, (ConversationId) r8, (arpe) null, 11, (byte[]) null), 3);
                return arnb.a;
            case 1:
                ?? r82 = this.c;
                Object obj2 = this.b;
                jfr jfrVar2 = (jfr) this.a;
                qjh.l(jfrVar2.b, null, new gvr(jfrVar2, (alog) obj2, (ConversationId) r82, (arpe) null, 10), 3);
                return arnb.a;
            case 2:
                ?? r83 = this.c;
                Object obj3 = this.b;
                jfr jfrVar3 = (jfr) this.a;
                qjh.l(jfrVar3.b, null, new gci(jfrVar3, (alog) obj3, (ConversationId) r83, (arpe) null, 8), 3);
                return arnb.a;
            case 3:
                Object obj4 = this.b;
                ?? r7 = this.a;
                jlw jlwVar = (jlw) this.c;
                qjh.l(jlwVar.e, null, new gvr(jlwVar, (jha) r7, (jmt) obj4, (arpe) null, 15), 3);
                return arnb.a;
            case 4:
                Float f = (Float) this.c.c();
                if (f != null) {
                    ((kbn) this.a).e(f.floatValue());
                }
                this.c.f(null);
                if (((Boolean) this.b.c()).booleanValue()) {
                    ((kbn) this.a).b();
                    this.b.f(false);
                }
                return arnb.a;
            case 5:
                this.b.a();
                Object obj5 = this.a;
                jva jvaVar = (jva) this.c;
                qjh.l(jvaVar.c, null, new jec(jvaVar, (Uri) obj5, (arpe) null, 18, (byte[]) null), 3);
                return arnb.a;
            case 6:
                this.b.a();
                Object obj6 = this.a;
                jva jvaVar2 = (jva) this.c;
                qjh.l(jvaVar2.c, null, new jec(jvaVar2, (Uri) obj6, (arpe) null, 19, (char[]) null), 3);
                return arnb.a;
            case 7:
                Object obj7 = this.c;
                ?? r1 = this.b;
                Object obj8 = this.a;
                akrh e = aktp.e("MessageUiAdapterImpl#createNewUiData#lazy");
                try {
                    qkg w = ((jat) obj8).w(r1, (jzz) obj7);
                    armd.i(e, null);
                    return w;
                } finally {
                }
            case 8:
                kbn kbnVar = (kbn) this.b;
                qjh.l(kbnVar.b, null, new kbl(kbnVar, (arpe) null, 0), 3);
                alvg alvgVar = (alvg) kbd.a.d().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider", "removeCachedAudioPlayer", 96, "AudioPlayerProvider.kt");
                Object obj9 = this.a;
                alvgVar.t("Remove cached AudioPlayer with uri: %s", obj9);
                if (((kbn) ((kbc) this.c).a.b.remove(obj9)) == null) {
                    ((alvg) kbd.a.i().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider", "removeCachedAudioPlayer", 99, "AudioPlayerProvider.kt")).q("Tried to remove AudioPlayer from cache when it does not exist.");
                }
                return arnb.a;
            case 9:
                Float bA = lga.bA(this.a);
                if (bA != null) {
                    ((kbn) this.b).e(bA.floatValue());
                }
                lga.bC(this.a, null);
                booleanValue = ((Boolean) this.c.a()).booleanValue();
                if (booleanValue) {
                    ((kbn) this.b).b();
                    this.c.h(Boolean.valueOf(false));
                }
                return arnb.a;
            case 10:
                ((kbq) this.a).f.m(2, (Long) this.c);
                ArrayList arrayList = new ArrayList();
                for (Object obj10 : this.b) {
                    if ((((nbb) obj10).a instanceof nbc) || yig.c()) {
                        arrayList.add(obj10);
                    }
                }
                ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    Object obj11 = this.a;
                    if (it.hasNext()) {
                        nbb nbbVar = (nbb) it.next();
                        alog<nba> alogVar = nbbVar.c;
                        ArrayList arrayList3 = new ArrayList(aqjn.J(alogVar, 10));
                        for (nba nbaVar : alogVar) {
                            kbq kbqVar = (kbq) obj11;
                            aevv q = ((vyv) kbqVar.a.b()).q(nbaVar.b, true);
                            if (qta.r()) {
                                str = wfh.x(nbaVar.a);
                            } else {
                                str = nbaVar.a;
                            }
                            str.getClass();
                            ((oqc) kbqVar.d.b()).a();
                            ?? r9 = nbbVar.a;
                            if (r9 instanceof nbc) {
                                String a = ((nbc) r9).a();
                                a.getClass();
                                aesvVar = new aesu(a);
                            } else {
                                String b = r9.b();
                                if (URLUtil.isValidUrl(b)) {
                                    aesvVar = new aesv(b);
                                } else {
                                    throw new IllegalStateException(a.bW(b, "Invalid Uri for Emotify:", " "));
                                }
                            }
                            arrayList3.add(new aesx(q, str, aesvVar));
                        }
                        arrayList2.add(arrayList3);
                    } else {
                        ((kbq) obj11).e.b(new kis(aqjn.K(arrayList2), new kbp(obj11, this.c, 1)));
                        return arnb.a;
                    }
                }
                break;
            case 11:
                this.c.a();
                Object obj12 = this.b;
                kbu kbuVar = (kbu) this.a;
                qjh.l(kbuVar.c, null, new jvr(kbuVar, (mty) obj12, (arpe) null, 12), 3);
                return arnb.a;
            case 12:
                Object obj13 = this.b;
                kbu kbuVar2 = (kbu) this.a;
                qjh.l(kbuVar2.c, null, new jvr(kbuVar2, (mty) obj13, (arpe) null, 13, (byte[]) null), 3);
                this.c.a();
                return arnb.a;
            case 13:
                this.c.a();
                Object obj14 = this.b;
                kbu kbuVar3 = (kbu) this.a;
                qjh.l(kbuVar3.c, null, new jvr(kbuVar3, (mty) obj14, (arpe) null, 14, (char[]) null), 3);
                return arnb.a;
            case 14:
                ?? r0 = this.c;
                kcy kcyVar = (kcy) this.a;
                jvr jvrVar = new jvr(kcyVar, (miz) r0, (arpe) null, 19);
                qjh.l(kcyVar.c, kcyVar.e, jvrVar, 2);
                this.b.a();
                return arnb.a;
            case 15:
                ((kcy) this.a).e(this.c);
                this.b.a();
                return arnb.a;
            case 16:
                ?? r5 = this.c;
                kcy kcyVar2 = (kcy) this.a;
                jvr jvrVar2 = new jvr(kcyVar2, (miz) r5, (arpe) null, 20, (byte[]) null);
                qjh.l(kcyVar2.c, kcyVar2.e, jvrVar2, 2);
                this.b.a();
                return arnb.a;
            case 17:
                ?? r52 = this.b;
                rae raeVar = (rae) this.a;
                kda kdaVar = new kda(raeVar, (miz) r52, (arpe) null, 2, (byte[]) null);
                qjh.l(raeVar.i, raeVar.a, kdaVar, 2);
                this.c.a();
                return arnb.a;
            case 18:
                Object obj15 = this.a;
                ?? r72 = this.b;
                kdh kdhVar = (kdh) this.c;
                qjh.l(kdhVar.b, null, new jyw(kdhVar, (arqg) r72, (kde) obj15, (arpe) null, 3), 3);
                return arnb.a;
            case 19:
                Object obj16 = this.b;
                ?? r73 = this.c;
                kdn kdnVar = (kdn) this.a;
                qjh.l(kdnVar.c, null, new gci(kdnVar, (MessageId) r73, (mxr) obj16, (arpe) null, 12), 3);
                return arnb.a;
            default:
                Object obj17 = this.b;
                ?? r74 = this.c;
                kdn kdnVar2 = (kdn) this.a;
                qjh.l(kdnVar2.c, null, new gci(kdnVar2, (MessageId) r74, (mxr) obj17, (arpe) null, 13, (byte[]) null), 3);
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfq(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfq(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        super(0);
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfq(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        super(0);
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfq(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        super(0);
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfq(kbn kbnVar, byn bynVar, byn bynVar2, int i) {
        super(0);
        this.d = i;
        this.b = kbnVar;
        this.a = bynVar;
        this.c = bynVar2;
    }
}
