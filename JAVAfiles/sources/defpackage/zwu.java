package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwu implements zsq {
    public static final utz a = uuh.n(uuh.b, "enable_unverified_sms_banner", false);
    public static final xze b = xze.g("Bugle", "UnverifiedSmsBanner2o");
    public final zsl c;
    public final ConversationIdType d;
    public boolean e;
    private final Context f;
    private final enh g;
    private final armf h;
    private final armf i;
    private final zwx j;
    private final zlc k;
    private final aohs l;

    public zwu(Context context, enh enhVar, zwx zwxVar, zlc zlcVar, aohs aohsVar, armf armfVar, armf armfVar2, zsl zslVar, ConversationIdType conversationIdType) {
        this.f = context;
        this.g = enhVar;
        this.j = zwxVar;
        this.k = zlcVar;
        this.l = aohsVar;
        this.h = armfVar;
        this.i = armfVar2;
        this.c = zslVar;
        this.d = conversationIdType;
    }

    @Override // defpackage.zsq
    public final zsm a() {
        return new zsm("UnverifiedSmsBanner", ((Boolean) a.e()).booleanValue());
    }

    @Override // defpackage.zsq
    public final void g() {
        zwx zwxVar = this.j;
        tay tayVar = zwxVar.b;
        if (tayVar != null) {
            tayVar.G(zwxVar.c);
        }
        enh enhVar = this.g;
        ConversationIdType conversationIdType = this.d;
        zwxVar.b = ush.g(conversationIdType);
        zwxVar.c = new zww(zwxVar, conversationIdType);
        zwxVar.b.F(enhVar, zwxVar.c);
        this.l.C(new akfk(zwxVar.f, new ikn(zwxVar, 18), "UNVERIFIED_SMS_BANNER_STATE_KEY".concat(conversationIdType.toString()), 2), new akgh<tqr>() { // from class: zwu.1
            @Override // defpackage.akgh
            public final void a(Throwable th) {
                zwu.b.q("Error getting verification status, conversationId: ".concat(zwu.this.d.toString()));
                zwu zwuVar = zwu.this;
                zwuVar.c.a(zwuVar, false);
            }

            @Override // defpackage.akgh
            public final /* bridge */ /* synthetic */ void c(Object obj) {
                tqr tqrVar = tqr.VERIFICATION_NA;
                int ordinal = ((tqr) obj).ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            zwu zwuVar = zwu.this;
                            if (!zwuVar.e) {
                                zwuVar.c.a(zwuVar, false);
                            }
                        }
                    } else {
                        zwu zwuVar2 = zwu.this;
                        zwuVar2.c.a(zwuVar2, true);
                    }
                } else {
                    zwu zwuVar3 = zwu.this;
                    zwuVar3.c.a(zwuVar3, false);
                }
                zwu.this.e = true;
            }

            @Override // defpackage.akgh
            public final /* synthetic */ void b() {
            }
        });
    }

    @Override // defpackage.zsq
    public final aabr h() {
        zlc zlcVar = this.k;
        Context context = this.f;
        ztr a2 = zlcVar.a(context);
        a2.e(context.getString(R.string.unverified_sms_banner_description));
        a2.p();
        a2.d(aabr.ac(this.f, this.h, this.i, R.string.unverified_sms_banner_body_text, utw.T, null));
        a2.i(new ztv(this, 14));
        a2.y = new ztw(this, 7);
        return a2;
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.zsq
    public final void f() {
    }
}
