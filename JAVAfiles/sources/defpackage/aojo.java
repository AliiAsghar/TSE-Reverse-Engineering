package defpackage;

import android.content.Context;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aojo implements aoep {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aojo(String str, Object obj, int i) {
        this.c = i;
        this.a = str;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, aojl] */
    @Override // defpackage.aoep
    public final Object a(aoeo aoeoVar) {
        if (this.c != 0) {
            return new aojk(this.a, this.b.a((Context) aoeoVar.e(Context.class)));
        }
        Object obj = this.b;
        try {
            Trace.beginSection(this.a);
            return ((aoen) obj).f.a(aoeoVar);
        } finally {
            Trace.endSection();
        }
    }
}
