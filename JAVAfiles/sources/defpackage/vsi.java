package defpackage;

import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vsi {
    public Optional a;
    public Optional b;
    public xhv c;
    public int d;
    public int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private Optional i;
    private Optional j;
    private Optional k;
    private Optional l;
    private Optional m;
    private Optional n;
    private Optional o;
    private Optional p;
    private int q;
    private boolean r;
    private Optional s;
    private boolean t;
    private byte u;

    public vsi() {
        throw null;
    }

    public final vsj a() {
        if (this.i.equals(Optional.of(-1L))) {
            ((alwl) vsj.a.m().h("com/google/android/apps/messaging/shared/rcs/conversation/RcsConversationAndThreadIdQueryParameters$Builder", "build", 195, "RcsConversationAndThreadIdQueryParameters.java")).q("INVALID session ID provided in RcsConversationAndThreadIdQueryParameters. Ignoring the session ID.");
            this.i = Optional.empty();
        }
        if (this.j.isPresent()) {
            if (this.a.isEmpty()) {
                ((alwl) vsj.a.m().h("com/google/android/apps/messaging/shared/rcs/conversation/RcsConversationAndThreadIdQueryParameters$Builder", "build", 204, "RcsConversationAndThreadIdQueryParameters.java")).q("RCS group self-msisdn not provided in RcsConversationAndThreadIdQueryParameters. Ignoring the rcsGroupSelfMsisdn");
                this.a = Optional.empty();
            }
            if (this.k.isEmpty() && !albo.ah(((GroupInfo) this.j.get()).c)) {
                String str = ((GroupInfo) this.j.get()).c;
                str.getClass();
                k(str);
            }
            if (this.l.isEmpty() && !albo.ah(((GroupInfo) this.j.get()).d)) {
                String str2 = ((GroupInfo) this.j.get()).d;
                str2.getClass();
                j(str2);
            }
            if (this.m.isEmpty() && ((GroupInfo) this.j.get()).a != null) {
                String str3 = ((GroupInfo) this.j.get()).a;
                str3.getClass();
                e(str3);
            }
            if (this.o.isEmpty() && !((GroupInfo) this.j.get()).b.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (UserInfo userInfo : ((GroupInfo) this.j.get()).b) {
                    if (!userInfo.d) {
                        arrayList.add(rxn.b(userInfo.a));
                    }
                }
                i(arrayList);
            }
        }
        if (this.u == 63 && this.c != null && this.d != 0 && this.e != 0) {
            return new vsj(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.a, this.n, this.o, this.b, this.p, this.q, this.c, this.r, this.d, this.s, this.t, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.u & 1) == 0) {
            sb.append(" createConversationIfNotPresent");
        }
        if ((this.u & 2) == 0) {
            sb.append(" isBot");
        }
        if ((this.u & 4) == 0) {
            sb.append(" isRcsGroup");
        }
        if ((this.u & 8) == 0) {
            sb.append(" rcsGroupJoinState");
        }
        if (this.c == null) {
            sb.append(" knownThreadForConversationCreation");
        }
        if ((this.u & 16) == 0) {
            sb.append(" hasBeenRestoredFromTelephony");
        }
        if (this.d == 0) {
            sb.append(" restorationSource");
        }
        if ((this.u & 32) == 0) {
            sb.append(" shouldTriggerCreationListeners");
        }
        if (this.e == 0) {
            sb.append(" conversationCreationSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.u = (byte) (this.u | 1);
    }

    public final void c(apwq apwqVar) {
        this.s = Optional.ofNullable(apwqVar);
    }

    public final void d(Optional optional) {
        if (optional != null) {
            this.n = optional;
            return;
        }
        throw new NullPointerException("Null defaultSelfParticipant");
    }

    public final void e(String str) {
        this.m = Optional.of(str);
    }

    public final void f(boolean z) {
        this.r = z;
        this.u = (byte) (this.u | 16);
    }

    public final void g(boolean z) {
        this.g = z;
        this.u = (byte) (this.u | 2);
    }

    public final void h(boolean z) {
        this.h = z;
        this.u = (byte) (this.u | 4);
    }

    public final void i(List list) {
        this.o = Optional.of(list);
    }

    public final void j(String str) {
        this.l = Optional.of(str);
    }

    public final void k(String str) {
        this.k = Optional.of(str);
    }

    public final void l(GroupInfo groupInfo) {
        this.j = Optional.of(groupInfo);
    }

    public final void m(int i) {
        this.q = i;
        this.u = (byte) (this.u | 8);
    }

    public final void n(amku amkuVar) {
        this.p = Optional.of(amkuVar);
    }

    public final void o(String str) {
        this.a = Optional.of(str);
    }

    public final void p(long j) {
        this.i = Optional.of(Long.valueOf(j));
    }

    public final void q(boolean z) {
        this.t = z;
        this.u = (byte) (this.u | 32);
    }

    public vsi(byte[] bArr) {
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.a = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.b = Optional.empty();
        this.p = Optional.empty();
        this.s = Optional.empty();
    }

    public vsi(vsj vsjVar) {
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.a = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.b = Optional.empty();
        this.p = Optional.empty();
        this.s = Optional.empty();
        this.f = vsjVar.b;
        this.g = vsjVar.c;
        this.h = vsjVar.d;
        this.i = vsjVar.e;
        this.j = vsjVar.f;
        this.k = vsjVar.g;
        this.l = vsjVar.h;
        this.m = vsjVar.i;
        this.a = vsjVar.j;
        this.n = vsjVar.k;
        this.o = vsjVar.l;
        this.b = vsjVar.m;
        this.p = vsjVar.n;
        this.q = vsjVar.o;
        this.c = vsjVar.p;
        this.r = vsjVar.q;
        this.d = vsjVar.t;
        this.s = vsjVar.r;
        this.t = vsjVar.s;
        this.e = vsjVar.u;
        this.u = (byte) 63;
    }
}
