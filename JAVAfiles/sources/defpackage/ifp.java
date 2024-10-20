package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ifp extends arrm implements arqv {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, byte[] bArr) {
        super(2, obj, gch.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        jgz jgzVar;
        Uri uri = null;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                arqv arqvVar = (arqv) obj2;
                str.getClass();
                arqvVar.getClass();
                ifq ifqVar = (ifq) this.e;
                akrc b = ((aksr) ifqVar.d).b("BlockedParticipantListItemUiAdapter#unblockAction");
                try {
                    qjh.l(ifqVar.e, null, new gvr(ifqVar, str, arqvVar, (arpe) null, 3), 3);
                    armd.i(b, null);
                    return arnb.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        armd.i(b, th);
                        throw th2;
                    }
                }
            case 1:
                gbb gbbVar = (gbb) obj;
                gaz gazVar = (gaz) obj2;
                gbbVar.getClass();
                gazVar.getClass();
                ((gch) this.e).b(gbbVar, gazVar);
                return arnb.a;
            case 2:
                miu miuVar = (miu) obj;
                lfx lfxVar = (lfx) obj2;
                miuVar.getClass();
                lfxVar.getClass();
                jeb jebVar = (jeb) this.e;
                qjh.l(jebVar.a, null, new gci(jebVar, miuVar, lfxVar, (arpe) null, 7), 3);
                return arnb.a;
            case 3:
                List list = (List) obj;
                int intValue = ((Number) obj2).intValue();
                list.getClass();
                jmc jmcVar = (jmc) this.e;
                if (list.size() > intValue) {
                    alvw f = jmc.a.f();
                    f.X(alwp.a, "BugleComposeRow2");
                    ((alvg) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "onClick", 109, "DraftAttachmentUiAdapterImpl.kt")).w("Attachments onClick %d, %s", intValue, list);
                    qjh.l(jmcVar.c, null, new jlz(jmcVar, list, intValue, null), 3);
                    return arnb.a;
                }
                throw new IllegalStateException("Clicked attachment position out of bounds.");
            case 4:
                List list2 = (List) obj;
                int intValue2 = ((Number) obj2).intValue();
                list2.getClass();
                jmc jmcVar2 = (jmc) this.e;
                alvw f2 = jmc.a.f();
                f2.X(alwp.a, "BugleComposeRow2");
                ((alvg) f2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "onMagicEdit", 130, "DraftAttachmentUiAdapterImpl.kt")).w("Attachments onMagicEdit %d, %s", intValue2, list2);
                jmi jmiVar = jmcVar2.d;
                if (!list2.isEmpty() && intValue2 >= 0 && intValue2 < list2.size()) {
                    jha jhaVar = (jha) list2.get(intValue2);
                    afcq q = hld.q(jhaVar);
                    if (q instanceof afso) {
                        if (jhaVar instanceof jgz) {
                            jgzVar = (jgz) jhaVar;
                        } else {
                            jgzVar = null;
                        }
                        if (jgzVar != null) {
                            uri = jgzVar.b.a;
                        }
                        if (uri == null) {
                            uri = Uri.parse(afsy.f((afso) q, jmiVar.b).i());
                        }
                        jmiVar.c.b(new lnl(uri, Integer.valueOf(intValue2)));
                    } else {
                        ((alvg) jmi.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentViewer", "magicEdit", 71, "DraftAttachmentViewer.kt")).w("No-op for magicEdit() on position %d of %s", intValue2, list2);
                    }
                    return arnb.a;
                }
                throw new IllegalArgumentException("Failed requirement.");
            case 5:
                int intValue3 = ((Number) obj).intValue();
                jzk jzkVar = (jzk) obj2;
                jxv jxvVar = (jxv) this.e;
                if (jzkVar == null) {
                    return a.cq(intValue3, "-no_id");
                }
                String a = jxv.a(jzkVar.a());
                Iterable iterable = (Iterable) Map.EL.getOrDefault(jxvVar.a, a, arnv.a);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    if (((Number) obj3).intValue() != intValue3) {
                        arrayList.add(obj3);
                    }
                }
                while (!arrayList.isEmpty()) {
                    a = a.concat("~");
                    Iterable iterable2 = (Iterable) Map.EL.getOrDefault(jxvVar.a, a, arnv.a);
                    arrayList = new ArrayList();
                    for (Object obj4 : iterable2) {
                        if (((Number) obj4).intValue() != intValue3) {
                            arrayList.add(obj4);
                        }
                    }
                }
                ?? r4 = jxvVar.a;
                Object obj5 = jxvVar.b;
                Integer valueOf = Integer.valueOf(intValue3);
                Object obj6 = ((HashMap) obj5).get(valueOf);
                arsd.i(r4);
                r4.remove(obj6);
                ?? r42 = jxvVar.a;
                List az = aqjn.az(arrayList);
                az.add(valueOf);
                r42.put(a, az);
                jxvVar.b.put(valueOf, a);
                return a;
            case 6:
                int intValue4 = ((Number) obj).intValue();
                jzj jzjVar = (jzj) obj2;
                jzjVar.getClass();
                jxv jxvVar2 = (jxv) this.e;
                ((HashMap) jxvVar2.a).remove(jxv.a(jzjVar.a()));
                ((HashMap) jxvVar2.b).remove(Integer.valueOf(intValue4));
                return arnb.a;
            case 7:
                MessageId messageId = (MessageId) obj;
                jzp jzpVar = (jzp) obj2;
                messageId.getClass();
                jzpVar.getClass();
                ((alvg) jzr.a.f().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "onCacheEntryRemoved", 119, "MessageUiDataCache.kt")).t("Canceling message scope. id = %s", messageId.a());
                arwi.g(jzpVar.c, null);
                return arnb.a;
            case 8:
                MessageId messageId2 = (MessageId) obj;
                mxr mxrVar = (mxr) obj2;
                messageId2.getClass();
                mxrVar.getClass();
                kdn kdnVar = (kdn) this.e;
                mjg mjgVar = kdnVar.e;
                if (mjgVar instanceof nay) {
                    nay nayVar = (nay) mjgVar;
                    ConversationId conversationId = kdnVar.d;
                    if (messageId2 instanceof BugleMessageId) {
                        Uri uri2 = ((mxq) mxrVar.c).d;
                        if (uri2 != null) {
                            Long l = mxrVar.a;
                            armf armfVar = nayVar.c;
                            long longValue = l.longValue();
                            uja ujaVar = (uja) armfVar.b();
                            if (!ujaVar.b(uri2.toString())) {
                                qjh.l(nayVar.b, null, new nax(ujaVar, conversationId, nayVar, messageId2, mxrVar, uri2, longValue, null), 3);
                            }
                        }
                        return arnb.a;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            case 9:
                miu miuVar2 = (miu) obj;
                alog alogVar = (alog) obj2;
                miuVar2.getClass();
                alogVar.getClass();
                kke kkeVar = (kke) this.e;
                qjh.l(kkeVar.b, null, new gci(kkeVar, alogVar, miuVar2, (arpe) null, 14), 3);
                return arnb.a;
            case 10:
                Set set = (Set) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                set.getClass();
                ((ndj) this.e).b(set, booleanValue);
                return arnb.a;
            case 11:
                Set set2 = (Set) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                set2.getClass();
                ((ndj) this.e).b(set2, booleanValue2);
                return arnb.a;
            case 12:
                Set set3 = (Set) obj;
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                set3.getClass();
                ((ndj) this.e).b(set3, booleanValue3);
                return arnb.a;
            case 13:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                yzk yzkVar = (yzk) this.e;
                zcu zcuVar = (zcu) yzkVar.l;
                zcuVar.b.g(mgv.H, null, ahqp.SUCCESS);
                zcuVar.d.i(mgv.G, 0);
                zcuVar.c.b(yci.i, null);
                zcu.a.o("contact list is interactive");
                zbk zbkVar = (zbk) yzkVar.e;
                ((ijp) zbkVar.b).d(5, zbkVar.a);
                if (booleanValue4) {
                    ((ijp) zbkVar.b).d(6, zbkVar.a);
                }
                zbkVar.c(booleanValue5);
                zbkVar.d = lgb.H((mgu) zbkVar.c, 176570);
                return arnb.a;
            case 14:
                return arro.q(((zuq) this.e).a, new zup(null), (arpe) obj2);
            case 15:
                zuv zuvVar = (zuv) this.e;
                return arro.q(zuvVar.c, new yhj(zuvVar, (alog) obj, (arpe) null, 10), (arpe) obj2);
            case 16:
                zvb zvbVar = (zvb) this.e;
                return arro.q(zvbVar.c, new yhj(zvbVar, (alog) obj, (arpe) null, 12), (arpe) obj2);
            case 17:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                zwc zwcVar = (zwc) this.e;
                if (!booleanValue6) {
                    return null;
                }
                String string = zwcVar.a.getString(R.string.cross_country_banner_title);
                String string2 = zwcVar.a.getString(R.string.cross_country_banner_body);
                ieh iehVar = new ieh();
                String string3 = zwcVar.a.getString(R.string.cross_country_banner_confirm_button);
                string3.getClass();
                iee ieeVar = new iee(string3, new zni(zwcVar, 10));
                String string4 = zwcVar.a.getString(R.string.cross_country_banner_dismiss_button);
                string4.getClass();
                return new ief("cross_country_banner", string, string2, iehVar, ieeVar, new iee(string4, new zni(zwcVar, 11)), null, null, 1536);
            case 18:
                zwp zwpVar = (zwp) obj;
                int i = zwpVar.b;
                zwm zwmVar = (zwm) this.e;
                if (i == 5) {
                    return null;
                }
                ResolvedRecipient resolvedRecipient = zwpVar.a;
                int i2 = i - 1;
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        return zwmVar.c(false, resolvedRecipient);
                    }
                    return zwmVar.c(true, resolvedRecipient);
                }
                String string5 = zwmVar.a.getString(R.string.unblock_banner_title);
                String string6 = zwmVar.a.getString(R.string.unblock_banner_body_v2);
                ieg iegVar = new ieg(aerb.z);
                String string7 = zwmVar.a.getString(R.string.unblock_banner_positive_button);
                string7.getClass();
                return new ief("unblock_unspam_banner", string5, string6, iegVar, new iee(string7, new zwj(zwmVar, resolvedRecipient, 0)), null, null, null, 1568);
            case 19:
                return ((abgk) this.e).d((abgs) obj, (arpe) obj2);
            default:
                return ((abgk) this.e).e((abgu) obj, (arpe) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i) {
        super(2, obj, ifq.class, "unblockAction", "unblockAction(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, char[] cArr) {
        super(2, obj, jeb.class, "onClick", "onClick(Lcom/google/android/apps/messaging/shared/api/messaging/ConversationProperties;Lcom/google/android/apps/messaging/shared/api/messaging/MessageComposeController;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, short[] sArr) {
        super(2, obj, jmc.class, "onClick", "onClick(Ljava/util/List;I)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, int[] iArr) {
        super(2, obj, jmc.class, "onMagicEdit", "onMagicEdit(Ljava/util/List;I)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, boolean[] zArr) {
        super(2, obj, jxv.class, "generate", "generate(ILcom/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiDataWrapper;)Ljava/lang/String;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, float[] fArr) {
        super(2, obj, jxv.class, "invalidate", "invalidate(ILcom/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiData;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, byte[][] bArr) {
        super(2, obj, jzr.class, "onCacheEntryRemoved", "onCacheEntryRemoved(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;Lcom/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache$CacheValue;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, char[][] cArr) {
        super(2, obj, kdn.class, "startRichCardAttachmentDownload", "startRichCardAttachmentDownload(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;Lcom/google/android/apps/messaging/shared/api/messaging/message/content/CardAttachment$CardAttachmentContent;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, short[][] sArr) {
        super(2, obj, kke.class, "onClick", "onClick(Lcom/google/android/apps/messaging/shared/api/messaging/ConversationProperties;Lcom/google/common/collect/ImmutableList;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, float[][] fArr) {
        super(2, obj, ndj.class, "handleChange", "handleChange(Ljava/util/Set;Z)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, byte[][][] bArr) {
        super(2, obj, yzk.class, "onContactListInteractive", "onContactListInteractive(ZZ)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, char[][][] cArr) {
        super(2, obj, zuq.class, "loadContent", "loadContent(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, short[][][] sArr) {
        super(2, obj, zuv.class, "loadContent", "loadContent(Lcom/google/common/collect/ImmutableList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, int[][][] iArr) {
        super(2, obj, zvb.class, "loadContent", "loadContent(Lcom/google/common/collect/ImmutableList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, boolean[][][] zArr) {
        super(2, obj, zwc.class, "loadContent", "loadContent(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, float[][][] fArr) {
        super(2, obj, zwm.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/unblockunspam/dataservice/UnblockUnspamBanner2LoadedData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(2, obj, abgk.class, "onDatagramSent", "onDatagramSent(Lcom/google/android/apps/stargate/proto/OnDatagramSentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(Object obj, int i, char[] cArr, byte[] bArr) {
        super(2, obj, abgk.class, "onReceiveDatagram", "onReceiveDatagram(Lcom/google/android/apps/stargate/proto/OnReceiveDatagramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }
}
