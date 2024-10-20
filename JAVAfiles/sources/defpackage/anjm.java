package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjm {
    public byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public anjm() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final anjn a() {
        int i = ~this.a;
        if ((i & 1) == 0) {
            Object obj = this.b;
            Object obj2 = this.c;
            Object obj3 = this.d;
            Object obj4 = this.e;
            if ((i & 2) != 0) {
                obj2 = anjq.b;
            }
            ?? r3 = obj3;
            if ((i & 4) != 0) {
                r3 = arnw.a;
            }
            if ((i & 8) != 0) {
                obj4 = anjg.a;
            }
            return new anjn((String) obj, (anjq) obj2, r3, (anjg) obj4);
        }
        throw new IllegalStateException("Missing required properties: name");
    }

    public final void b(anjg anjgVar) {
        this.e = anjgVar;
        this.a = (byte) (this.a | 8);
    }

    public final void c(Map map) {
        this.d = map;
        this.a = (byte) (this.a | 4);
    }

    public final void d(String str) {
        if (str != null) {
            this.b = str;
            this.a = (byte) (this.a | 1);
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void e(anjq anjqVar) {
        if (anjqVar != null) {
            this.c = anjqVar;
            this.a = (byte) (this.a | 2);
            return;
        }
        throw new NullPointerException("Null type");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List f() {
        ?? r0 = this.d;
        if (r0 != 0) {
            return r0;
        }
        throw new IllegalStateException("Property \"priceLevels\" has not been set");
    }

    public final void g(List list) {
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null placeFields");
    }

    public final void h(List list) {
        if (list != null) {
            this.d = list;
            return;
        }
        throw new NullPointerException("Null priceLevels");
    }

    public final ahom i() {
        Object obj;
        if (this.a == 1 && (obj = this.b) != null) {
            return new ahom((String) obj, (ahka) this.c, (algw) this.d, (algw) this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" eventName");
        }
        if (this.a == 0) {
            sb.append(" enablePerfettoTraceCollection");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(ahka ahkaVar) {
        String str = ahkaVar.a;
        if (str != null) {
            this.b = str;
            this.c = ahkaVar;
            return;
        }
        throw new NullPointerException("Null eventName");
    }

    public final void k() {
        this.a = (byte) 1;
    }

    public anjm(byte[] bArr, byte[] bArr2) {
        alfd alfdVar = alfd.a;
        this.d = alfdVar;
        this.e = alfdVar;
    }

    public anjm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        alfd alfdVar = alfd.a;
        this.e = alfdVar;
        this.b = alfdVar;
        this.d = alfdVar;
    }
}
