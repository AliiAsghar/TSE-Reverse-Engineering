package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jya extends arrm implements arqr {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, byte[] bArr) {
        super(1, obj, jyk.class, "onMessageListInteractive", "onMessageListInteractive(Landroid/content/Context;)V", 0);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, khl] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r15v75, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r1v13, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                aetq aetqVar = (aetq) obj;
                aetqVar.getClass();
                jyk jykVar = (jyk) this.e;
                kkc kkcVar = jykVar.G;
                aiut.c();
                if (aetqVar instanceof jzx) {
                    kkcVar.a.r(((jzx) aetqVar).c, 1);
                }
                aluq listIterator = ((altg) jykVar.h).listIterator();
                while (listIterator.hasNext()) {
                    ((jxx) listIterator.next()).a();
                }
                return arnb.a;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                jyk jykVar2 = (jyk) this.e;
                ((alvg) jyk.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl", "onMessageListInteractive", 531, "PagedMessageListUiAdapterImpl.kt")).q("message list interactive");
                jykVar2.c.e(context);
                jykVar2.e.h();
                kgu kguVar = jykVar2.D;
                kda kdaVar = new kda(kguVar, jykVar2.u, (arpe) null, 8);
                qjh.l(kguVar.b, kguVar.c, kdaVar, 2);
                aluq listIterator2 = ((altx) jykVar2.J.a).listIterator();
                while (listIterator2.hasNext()) {
                    izz izzVar = (izz) listIterator2.next();
                    qjh.l(izzVar.b, null, new ikq(izzVar, (arpe) null, 1), 3);
                }
                jykVar2.F.b.f(true);
                return arnb.a;
            case 2:
                MessageId messageId = (MessageId) obj;
                messageId.getClass();
                kcr kcrVar = (kcr) this.e;
                qjh.l(kcrVar.c, null, new kca(messageId, kcrVar, (arpe) null, 2), 3);
                return arnb.a;
            case 3:
                MessageId messageId2 = (MessageId) obj;
                messageId2.getClass();
                kcr kcrVar2 = (kcr) this.e;
                qjh.l(kcrVar2.c, null, new jvr(messageId2, kcrVar2, (arpe) null, 18), 3);
                return arnb.a;
            case 4:
                List list = (List) obj;
                list.getClass();
                ((jfa) this.e).e(list);
                return arnb.a;
            case 5:
                MessageId messageId3 = (MessageId) obj;
                messageId3.getClass();
                qiu.h(((kdh) this.e).c.m(messageId3));
                ((alvg) kdh.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "pauseFileTransfer", 220, "ProgressBarOverlayUiAdapter.kt")).t("Pausing file transfer for messageId=%s", messageId3);
                return arnb.a;
            case 6:
                mxr mxrVar = (mxr) obj;
                mxrVar.getClass();
                mjg mjgVar = ((kdn) this.e).e;
                if (mjgVar instanceof nay) {
                    nay nayVar = (nay) mjgVar;
                    Uri uri = ((mxq) mxrVar.c).b;
                    if (uri != null) {
                        qjh.l(nayVar.b, null, new jyw(nayVar, uri, mxrVar, (arpe) null, 19), 3);
                    }
                    return arnb.a;
                }
                throw new IllegalArgumentException("Failed requirement.");
            case 7:
                mxr mxrVar2 = (mxr) obj;
                mxrVar2.getClass();
                mjg mjgVar2 = ((kdn) this.e).e;
                if (mjgVar2 instanceof nay) {
                    nay nayVar2 = (nay) mjgVar2;
                    Uri uri2 = ((mxq) mxrVar2.c).d;
                    if (uri2 != null) {
                        uja ujaVar = (uja) nayVar2.c.b();
                        long j = mxrVar2.d;
                        uiz uizVar = ujaVar.a;
                        ujc ujcVar = (ujc) uizVar;
                        if (ujcVar.d.a()) {
                            qiu.h(aktp.ai(new ujb(uizVar, j, i), ujcVar.b));
                        }
                        ujcVar.a(uri2);
                    }
                    return arnb.a;
                }
                throw new IllegalArgumentException("Failed requirement.");
            case 8:
                myn mynVar = (myn) obj;
                mynVar.getClass();
                kdn kdnVar = (kdn) this.e;
                qjh.l(kdnVar.c, null, new kda(kdnVar, mynVar, (arpe) null, 3), 3);
                return arnb.a;
            case 9:
                myn mynVar2 = (myn) obj;
                mynVar2.getClass();
                kdn kdnVar2 = (kdn) this.e;
                qjh.l(kdnVar2.c, null, new kda(kdnVar2, mynVar2, (arpe) null, 4, (byte[]) null), 3);
                return arnb.a;
            case 10:
                Uri uri3 = (Uri) obj;
                uri3.getClass();
                kdu kduVar = (kdu) this.e;
                ((alvg) kdu.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter", "navigateToLink", 223, "LinkPreviewUiAdapter.kt")).q("Preview clicked; opening browser");
                kduVar.j.b(new lms(uri3));
                return arnb.a;
            case 11:
                Uri uri4 = (Uri) obj;
                uri4.getClass();
                ked kedVar = (ked) this.e;
                qjh.l(kedVar.c, null, new kda(kedVar, uri4, (arpe) null, 5), 3);
                return arnb.a;
            case 12:
                lkf lkfVar = (lkf) obj;
                lkfVar.getClass();
                ((ked) this.e).h.b(lkfVar);
                return arnb.a;
            case 13:
                MessageId messageId4 = (MessageId) obj;
                messageId4.getClass();
                ken kenVar = (ken) this.e;
                qjh.l(kenVar.b, null, new kca(messageId4, kenVar, (arpe) null, 8), 3);
                return arnb.a;
            case 14:
                MessageId messageId5 = (MessageId) obj;
                messageId5.getClass();
                ken kenVar2 = (ken) this.e;
                qjh.l(kenVar2.b, null, new kda(messageId5, kenVar2, (arpe) null, 6), 3);
                return arnb.a;
            case 15:
                kix kixVar = (kix) obj;
                kixVar.getClass();
                khw khwVar = (khw) this.e;
                if (d.F(kixVar, kiw.a)) {
                    khwVar.o.a(true);
                } else if (kixVar instanceof kiv) {
                    kjc kjcVar = khwVar.n;
                    float f = ((kiv) kixVar).a;
                    if (kjcVar.e) {
                        float floatValue = ((Number) kjcVar.g.c()).floatValue() * f;
                        Object e = kjcVar.b.e();
                        e.getClass();
                        float floatValue2 = ((Number) e).floatValue();
                        Object e2 = kjcVar.c.e();
                        e2.getClass();
                        float q = arrn.q(floatValue, floatValue2, ((Number) e2).floatValue());
                        Float f2 = (Float) kjcVar.g.c();
                        if (f2 == null || q != f2.floatValue()) {
                            kjcVar.g.f(Float.valueOf(q));
                            arxm arxmVar = kjcVar.f;
                            if (arxmVar != null) {
                                arxmVar.v(null);
                            }
                            kjcVar.f = qjh.l(kjcVar.a, null, new kjb(kjcVar, q, null), 3);
                        }
                    }
                } else if (d.F(kixVar, kiw.b)) {
                    khwVar.o.a(false);
                } else {
                    throw new armm();
                }
                return arnb.a;
            case 16:
                int intValue = ((Number) obj).intValue();
                kjp kjpVar = (kjp) ((kjp) this.e).d;
                if (!kjpVar.c.contains("top_content_inset")) {
                    kjpVar.b.put("top_content_inset", Integer.valueOf(arrn.r(intValue, 0)));
                    ?? r15 = kjpVar.d;
                    Collection values = ((HashMap) kjpVar.b).values();
                    values.getClass();
                    r15.f(Integer.valueOf(aqjn.U(values)));
                }
                return arnb.a;
            case 17:
                String str = (String) obj;
                str.getClass();
                ((kke) this.e).l.f(str);
                return arnb.a;
            case 18:
                Context context2 = (Context) obj;
                context2.getClass();
                ((kkg) this.e).b.h(context2);
                return arnb.a;
            case 19:
                ((lie) this.e).a(((Boolean) obj).booleanValue());
                return arnb.a;
            default:
                String str2 = (String) obj;
                str2.getClass();
                ((lih) this.e).d(str2);
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i) {
        super(1, obj, jyk.class, "onMostRecentMessageDisplayedOrChanged", "onMostRecentMessageDisplayedOrChanged(Lcom/google/android/libraries/communications/ux/components/message/MessageUiData;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, char[] cArr) {
        super(1, obj, kcr.class, "onCancelClicked", "onCancelClicked(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, short[] sArr) {
        super(1, obj, kcr.class, "onDownloadClicked", "onDownloadClicked(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, int[] iArr) {
        super(1, obj, jfa.class, "saveAttachments", "saveAttachments(Ljava/util/List;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, boolean[] zArr) {
        super(1, obj, kdh.class, "pauseFileTransfer", "pauseFileTransfer(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, float[] fArr) {
        super(1, obj, kdn.class, "clearRichCardAttachmentOnPermanentFailure", "clearRichCardAttachmentOnPermanentFailure(Lcom/google/android/apps/messaging/shared/api/messaging/message/content/CardAttachment$CardAttachmentContent;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, byte[][] bArr) {
        super(1, obj, kdn.class, "cancelRichCardAttachmentDownload", "cancelRichCardAttachmentDownload(Lcom/google/android/apps/messaging/shared/api/messaging/message/content/CardAttachment$CardAttachmentContent;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, char[][] cArr) {
        super(1, obj, kdn.class, "openImage", "openImage(Lcom/google/android/apps/messaging/shared/api/messaging/message/content/PhotoVideoContent;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, short[][] sArr) {
        super(1, obj, kdn.class, "openVideo", "openVideo(Lcom/google/android/apps/messaging/shared/api/messaging/message/content/PhotoVideoContent;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, int[][] iArr) {
        super(1, obj, kdu.class, "navigateToLink", "navigateToLink(Landroid/net/Uri;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, boolean[][] zArr) {
        super(1, obj, ked.class, "navigateToImage", "navigateToImage(Landroid/net/Uri;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, float[][] fArr) {
        super(1, obj, ked.class, "navigateToLink", "navigateToLink(Lcom/google/android/apps/messaging/navigation/NavigationTarget$NoResult;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, byte[][][] bArr) {
        super(1, obj, ken.class, "onCancelClicked", "onCancelClicked(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, char[][][] cArr) {
        super(1, obj, ken.class, "onDownloadClicked", "onDownloadClicked(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, short[][][] sArr) {
        super(1, obj, khw.class, "onZoomEvent", "onZoomEvent(Lcom/google/android/apps/messaging/conversation2/screen/pinchtozoom/PinchToZoomEvent;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, int[][][] iArr) {
        super(1, obj, kjp.class, "onHeightComputed", "onHeightComputed(I)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, boolean[][][] zArr) {
        super(1, obj, kke.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, float[][][] fArr) {
        super(1, obj, kkg.class, "onInteractive", "onInteractive(Landroid/content/Context;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(1, obj, lie.class, "onScroll", "onScroll(Z)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Object obj, int i, char[] cArr, byte[] bArr) {
        super(1, obj, lih.class, "setSearchQuery", "setSearchQuery(Ljava/lang/String;)V", 0);
        this.a = i;
    }
}
