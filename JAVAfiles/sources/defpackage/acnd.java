package defpackage;

import android.net.Uri;
import android.telephony.ims.RcsUceAdapter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acnd implements dts {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ acnd(acnf acnfVar, long j, Uri uri, RcsUceAdapter rcsUceAdapter, int i) {
        this.e = i;
        this.d = acnfVar;
        this.a = j;
        this.c = uri;
        this.b = rcsUceAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.dts
    public final Object a(dtq dtqVar) {
        if (this.e != 0) {
            Object obj = this.b;
            Object obj2 = this.c;
            return ((acnf) this.d).e(this.a, (Uri) obj2, anf$$ExternalSyntheticApiModelOutline0.m70m(obj), dtqVar);
        }
        ?? r4 = this.d;
        Object obj3 = this.c;
        return ((acnf) this.b).f(this.a, anf$$ExternalSyntheticApiModelOutline0.m70m(obj3), r4, dtqVar);
    }

    public /* synthetic */ acnd(acnf acnfVar, long j, RcsUceAdapter rcsUceAdapter, List list, int i) {
        this.e = i;
        this.b = acnfVar;
        this.a = j;
        this.c = rcsUceAdapter;
        this.d = list;
    }
}
