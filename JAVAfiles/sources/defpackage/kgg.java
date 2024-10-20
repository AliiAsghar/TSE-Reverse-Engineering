package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgg implements jhp, kgh {
    public final Context a;
    public final arwe b;
    public final mjg c;
    public final jat d;
    public final qdq e;
    private final asai f;
    private final ascd g;
    private final arml h;

    public kgg(Context context, arwe arweVar, mjg mjgVar, asai asaiVar, jat jatVar, qdq qdqVar) {
        context.getClass();
        arweVar.getClass();
        mjgVar.getClass();
        asaiVar.getClass();
        qdqVar.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = mjgVar;
        this.f = asaiVar;
        this.d = jatVar;
        this.e = qdqVar;
        this.g = ascy.a(false);
        this.h = armd.a(new kdz(this, 11));
    }

    @Override // defpackage.jhp
    public final void a(jhc jhcVar) {
        if (jhcVar.g != null) {
            this.g.f(true);
        }
    }

    @Override // defpackage.kgh
    public final ascv b() {
        asai P = arrn.P((asai) this.h.a(), this.f, this.g, new kgf(this, (arpe) null, 0));
        int i = ascp.a;
        ascp ascpVar = asco.a;
        int i2 = alog.d;
        alog alogVar = alsx.a;
        alogVar.getClass();
        String string = this.a.getString(R.string.scheduled_messages_list_button_text, 0);
        string.getClass();
        return arrn.T(P, this.b, ascpVar, new kgk(alogVar, new aeqi(string, ((Boolean) this.g.c()).booleanValue(), new jwl((Object) this, 7, (byte[][]) null))));
    }

    public final void c() {
        this.g.f(Boolean.valueOf(!((Boolean) this.g.c()).booleanValue()));
    }
}
