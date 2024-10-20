package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jvq extends arrm implements arqw {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvq(Object obj, int i, byte[] bArr) {
        super(3, obj, jdb.class, "addPeople", "addPeople(Ljava/util/List;Lcom/google/android/apps/messaging/shared/api/messaging/ConversationProperties;Lcom/google/android/apps/messaging/shared/api/messaging/ComposeConstraints;)V", 0);
        this.a = i;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        if (i != 0) {
            boolean z = true;
            SelfIdentityId selfIdentityId = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                zdo zdoVar = (zdo) this.e;
                                return arro.q(zdoVar.b, new zdm(zdoVar, (zem) obj2, (String) obj, null), (arpe) obj3);
                            }
                            return ((zcr) this.e).c((alog) obj, (nfw) obj2, (arpe) obj3);
                        }
                        int intValue = ((Number) obj).intValue();
                        long longValue = ((Number) obj2).longValue();
                        PendingIntent pendingIntent = (PendingIntent) obj3;
                        pendingIntent.getClass();
                        ((AlarmManager) this.e).setAndAllowWhileIdle(intValue, longValue, pendingIntent);
                        return arnb.a;
                    }
                    int intValue2 = ((Number) obj).intValue();
                    long longValue2 = ((Number) obj2).longValue();
                    PendingIntent pendingIntent2 = (PendingIntent) obj3;
                    pendingIntent2.getClass();
                    ((AlarmManager) this.e).setExactAndAllowWhileIdle(intValue2, longValue2, pendingIntent2);
                    return arnb.a;
                }
                Uri uri = (Uri) obj2;
                String str = (String) obj3;
                ((miz) obj).getClass();
                uri.getClass();
                str.getClass();
                kcr kcrVar = (kcr) this.e;
                alvw g = kcr.a.g();
                g.X(alwp.a, "BugleImage");
                ((alvg) g.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter", "openImage", 553, "ImageBubbleUiAdapter.kt")).t("Opening media viewer with uri: %s", yyb.bc(uri));
                qjh.l(kcrVar.c, null, new jyw(kcrVar, uri, str, (arpe) null, 2), 3);
                return arnb.a;
            }
            List list = (List) obj;
            miu miuVar = (miu) obj2;
            mwc mwcVar = (mwc) obj3;
            list.getClass();
            miuVar.getClass();
            mwcVar.getClass();
            jdb jdbVar = (jdb) this.e;
            ijp.e((ijp) jdbVar.e.b(), 16, -1, 3, 8);
            mll mllVar = (mll) miuVar;
            izc izcVar = (izc) jdbVar.d.b();
            mit b = mllVar.b();
            mjq mjqVar = mwcVar.c;
            mit mitVar = mit.GROUP;
            boolean z2 = mjqVar.g;
            boolean k = mllVar.k();
            qpd v = mllVar.v();
            v.getClass();
            if (b != mitVar) {
                z = false;
            }
            int a = izcVar.a(z, z2, k, v);
            lkd lkdVar = jdbVar.i;
            ConversationId conversationId = jdbVar.b;
            nfw f = miuVar.f();
            if (f != null) {
                selfIdentityId = f.f();
            }
            lkdVar.b(new lle(conversationId, list, selfIdentityId, a));
            return arnb.a;
        }
        Context context = (Context) obj;
        int intValue3 = ((Number) obj2).intValue();
        arpe arpeVar = (arpe) obj3;
        jvs jvsVar = (jvs) this.e;
        if (((jvw) jvsVar.c.b()).i()) {
            return arnb.a;
        }
        jvsVar.g(context, intValue3);
        Object d = ((aghy) jvsVar.g.b()).b.d(arpeVar);
        if (d != arpl.a) {
            return arnb.a;
        }
        return d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvq(Object obj, int i) {
        super(3, obj, jvs.class, "onError", "onError(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvq(Object obj, int i, char[] cArr) {
        super(3, obj, kcr.class, "openImage", "openImage(Lcom/google/android/apps/messaging/shared/api/messaging/Message;Landroid/net/Uri;Ljava/lang/String;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvq(Object obj, int i, short[] sArr) {
        super(3, obj, AlarmManager.class, "setExactAndAllowWhileIdle", "setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvq(Object obj, int i, int[] iArr) {
        super(3, obj, AlarmManager.class, "setAndAllowWhileIdle", "setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvq(Object obj, int i, boolean[] zArr) {
        super(3, obj, zcr.class, "startOneToOneChat", "startOneToOneChat(Lcom/google/common/collect/ImmutableList;Lcom/google/android/apps/messaging/shared/api/messaging/selfidentity/SelfIdentity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvq(Object obj, int i, float[] fArr) {
        super(3, obj, zdo.class, "getGroupChatInSearch", "getGroupChatInSearch(Ljava/lang/String;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }
}
