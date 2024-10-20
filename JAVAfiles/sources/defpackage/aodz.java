package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.AutoValue_AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.AutoValue_CreateGroupResponse;
import com.google.android.rcs.client.messaging.AutoValue_JoinGroupResponse;
import com.google.android.rcs.client.messaging.AutoValue_RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.AutoValue_SendMessageResponse;
import com.google.android.rcs.client.messaging.AutoValue_TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.AutoValue_UpdateGroupResponse;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.JoinGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.SendMessageResponse;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;
import com.google.android.rcs.client.messaging.data.AutoValue_BasicTextMessage;
import com.google.android.rcs.client.messaging.data.AutoValue_TraceId;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.TraceId;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aodz {
    private static WeakReference b;
    public Object a;

    public aodz() {
        throw null;
    }

    public static /* synthetic */ void I(aodz aodzVar, Activity activity, afip afipVar, rv rvVar) {
        String str;
        rw a;
        activity.getClass();
        afipVar.getClass();
        if (activity instanceof cj) {
            cj cjVar = (cj) activity;
            String aK = aqjn.aK(afipVar.a, "_", null, null, null, 62);
            StringBuilder sb = new StringBuilder("compose_system_content_picker_");
            sb.append(aK);
            sb.append("_");
            if (true != afipVar.b) {
                str = "single";
            } else {
                str = "multiple";
            }
            sb.append(str);
            String sb2 = sb.toString();
            if (afipVar.b) {
                a = cjVar.g.a(sb2, new afiq(cjVar, afipVar), rvVar);
            } else {
                a = cjVar.g.a(sb2, new afir(cjVar, afipVar), new yjk(rvVar, 5));
            }
            aodzVar.a = a;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static synchronized aodz a(Context context) {
        aodz aodzVar;
        synchronized (aodz.class) {
            abhg.m(context);
            WeakReference weakReference = b;
            if (weakReference == null) {
                aodzVar = null;
            } else {
                aodzVar = (aodz) weakReference.get();
            }
            if (aodzVar == null) {
                aodz aodzVar2 = new aodz(context.getApplicationContext());
                b = new WeakReference(aodzVar2);
                return aodzVar2;
            }
            return aodzVar;
        }
    }

    public final void A(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.a = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final AddUserToGroupResponse B() {
        Object obj = this.a;
        if (obj != null) {
            return new AutoValue_AddUserToGroupResponse((MessagingResult) obj);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    public final void C(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.a = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final void D() {
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    public final void E() {
        aiut.c();
        this.a.getClass();
        for (aier aierVar : aier.values()) {
            aies aiesVar = (aies) this.a.get(aierVar);
            if (aiesVar != null) {
                aiesVar.a();
            }
        }
        this.a = null;
    }

    public final void F(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null fuelPrices");
    }

    public final void G() {
        Object obj = this.a;
        if (obj == null) {
            arro.b("launcher");
            obj = null;
        }
        ((rw) obj).c("*/*");
    }

    public final void b(int i, aoee aoeeVar) {
        aoeeVar.e.a = i;
        ((abrc) this.a).i(new aoeg(new aoee[]{aoeeVar}));
    }

    public final int c() {
        return ((aosw) this.a).c;
    }

    public final long d() {
        return ((aosw) this.a).d;
    }

    public final void e(long j) {
        aozy createBuilder = aosw.a.createBuilder((apag) this.a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aosw aoswVar = (aosw) createBuilder.b;
        aoswVar.b |= 2;
        aoswVar.d = j;
        this.a = (aosw) createBuilder.s();
    }

    public final boolean f() {
        if ((((aosw) this.a).b & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((((aosw) this.a).b & 64) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int h() {
        String str;
        char c;
        int o = aotl.o(((aosw) this.a).i);
        if (o == 0) {
            o = 1;
        }
        if (o == 1) {
            str = "UNSPECIFIED";
        } else if (o == 2) {
            str = "FROM_NUMBER_WITH_PLUS_SIGN";
        } else if (o == 6) {
            str = "FROM_NUMBER_WITH_IDD";
        } else if (o == 11) {
            str = "FROM_NUMBER_WITHOUT_PLUS_SIGN";
        } else if (o == 21) {
            str = "FROM_DEFAULT_COUNTRY";
        } else {
            str = "null";
        }
        switch (str.hashCode()) {
            case -1655163414:
                if (str.equals("FROM_NUMBER_WITH_PLUS_SIGN")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -702235158:
                if (str.equals("FROM_NUMBER_WITHOUT_PLUS_SIGN")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 526786327:
                if (str.equals("UNSPECIFIED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1308390705:
                if (str.equals("FROM_NUMBER_WITH_IDD")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1337199811:
                if (str.equals("FROM_DEFAULT_COUNTRY")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        if (c == 4) {
            return 5;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aojy, java.lang.Object] */
    public final aknj i() {
        ?? r0 = this.a;
        if (r0 != 0) {
            aknj aknjVar = new aknj(r0);
            albo.U(true, "If host is set, port must be set (and vice-versa)");
            albo.X(true, "Host string is invalid: %s", null);
            return aknjVar;
        }
        throw new IllegalStateException("Missing required properties: rpcServiceConfig");
    }

    public final void j(aojy aojyVar) {
        if (aojyVar != null) {
            this.a = aojyVar;
            return;
        }
        throw new NullPointerException("Null rpcServiceConfig");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Future, java.lang.Object] */
    public final void k() {
        Object akhmVar;
        aiut.c();
        Object obj = this.a;
        obj.getClass();
        akhk akhkVar = (akhk) obj;
        albo.U(akhkVar.b.f(), "LocalSubscriptionState detected an atomicity failure. Previous pendingResult was already cleared. If this Exception is ever thrown, it is a major bug, and should be reported to TikTok as a P1 along with the Sponge or Listnr error report. Please file at go/tiktok/bug.");
        try {
            akhmVar = new akhn(albo.bQ(((akhk) obj).b.b()));
        } catch (ExecutionException e) {
            akhmVar = new akhm(e.getCause());
        }
        this.a = new akhk(akhkVar.a, alfd.a, algw.i(akhmVar), akhkVar.d);
    }

    public final TraceId l() {
        Object obj = this.a;
        if (obj != null) {
            if (albo.ah((String) obj)) {
                m(UUID.randomUUID().toString());
            }
            Object obj2 = this.a;
            if (obj2 != null) {
                return new AutoValue_TraceId((String) obj2);
            }
            throw new IllegalStateException("Missing required properties: id");
        }
        throw new IllegalStateException("Property \"id\" has not been set");
    }

    public final void m(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final BasicTextMessage n() {
        Object obj = this.a;
        if (obj != null) {
            return new AutoValue_BasicTextMessage((String) obj);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    public final void o(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null content");
    }

    public final UpdateGroupResponse p() {
        Object obj = this.a;
        if (obj != null) {
            return new AutoValue_UpdateGroupResponse((MessagingResult) obj);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    public final void q(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.a = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final TriggerGroupNotificationResponse r() {
        Object obj = this.a;
        if (obj != null) {
            return new AutoValue_TriggerGroupNotificationResponse((MessagingResult) obj);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    public final void s(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.a = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final SendMessageResponse t() {
        Object obj = this.a;
        if (obj != null) {
            return new AutoValue_SendMessageResponse((MessagingResult) obj);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    public final void u(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.a = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final RemoveUserFromGroupResponse v() {
        Object obj = this.a;
        if (obj != null) {
            return new AutoValue_RemoveUserFromGroupResponse((MessagingResult) obj);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    public final void w(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.a = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final JoinGroupResponse x() {
        Object obj = this.a;
        if (obj != null) {
            return new AutoValue_JoinGroupResponse((MessagingResult) obj);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    public final void y(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.a = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final CreateGroupResponse z() {
        Object obj = this.a;
        if (obj != null) {
            return new AutoValue_CreateGroupResponse((MessagingResult) obj);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    public aodz(Object obj) {
        this.a = obj;
    }

    public aodz(Map map) {
        this.a = map;
    }

    public aodz(char[] cArr) {
    }

    public aodz(Context context) {
        aaoc aaocVar = abjf.a;
        abqx abqxVar = abqy.q;
        adxq adxqVar = new adxq();
        adxqVar.b = new aodm(0);
        this.a = new abrc(context, aaocVar, abqxVar, adxqVar.j());
    }

    public aodz(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.d = SwipeDismissBehavior.M(0.1f);
        swipeDismissBehavior.e = SwipeDismissBehavior.M(0.6f);
        swipeDismissBehavior.c = 0;
    }
}
