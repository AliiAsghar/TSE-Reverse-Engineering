package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgj implements kgh {
    public final Context a;
    public final arwe b;
    public final mjg c;
    public final jat d;
    public final qdq e;
    private final asai f;
    private final arml g;
    private final ibi h;

    public kgj(Context context, arwe arweVar, mjg mjgVar, asai asaiVar, jat jatVar, qdq qdqVar, ibi ibiVar) {
        context.getClass();
        arweVar.getClass();
        mjgVar.getClass();
        asaiVar.getClass();
        qdqVar.getClass();
        ibiVar.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = mjgVar;
        this.f = asaiVar;
        this.d = jatVar;
        this.e = qdqVar;
        this.h = ibiVar;
        this.g = armd.a(new kdz(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ascd] */
    public final void a() {
        this.h.a.f(Boolean.valueOf(!((Boolean) r0.c()).booleanValue()));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, ascd] */
    @Override // defpackage.kgh
    public final ascv b() {
        asai P = arrn.P((asai) this.g.a(), this.f, this.h.a, new kgf(this, (arpe) null, 2));
        int i = ascp.a;
        ascp ascpVar = asco.a;
        int i2 = alog.d;
        alog alogVar = alsx.a;
        alogVar.getClass();
        String string = this.a.getString(R.string.scheduled_messages_list_button_text, 0);
        string.getClass();
        return arrn.T(P, this.b, ascpVar, new kgk(alogVar, new aeqi(string, ((Boolean) this.h.a.c()).booleanValue(), new jwl((Object) this, 9, (int[][]) null))));
    }
}
