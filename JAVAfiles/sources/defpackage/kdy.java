package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdy extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdy(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [cas, java.lang.Object] */
    @Override // defpackage.arqg
    public final Object a() {
        Object obj;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return ((qjr) this.a).b();
            }
            return this.a.a();
        }
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            qkg qkgVar = ((qkg[]) this.a)[i2];
            if (qkgVar != null) {
                obj = qkgVar.b();
            } else {
                obj = null;
            }
            arrayList.add(obj);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj2 = array[0];
        aeze aezeVar = (aeze) array[1];
        aezf aezfVar = (aezf) obj2;
        if (((Boolean) array[2]).booleanValue()) {
            return aezf.h(aezfVar, null, null, aezeVar, null, null, false, 2097147);
        }
        return aezf.h(aezfVar, null, null, aezeVar, null, null, false, 2095099);
    }
}
