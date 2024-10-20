package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvr extends dvk {
    public float ao;

    @Deprecated
    protected final HashMap ap;

    @Deprecated
    protected final HashMap aq;

    @Deprecated
    protected final HashMap ar;
    public dvm as;
    private HashMap at;
    private HashMap au;

    public dvr(dvo dvoVar, int i) {
        super(dvoVar, i);
        this.ao = 0.5f;
        this.ap = new HashMap();
        this.aq = new HashMap();
        this.ar = new HashMap();
        this.as = dvm.SPREAD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float A(String str) {
        HashMap hashMap = this.au;
        if (hashMap != null && hashMap.containsKey(str)) {
            return ((Float) this.au.get(str)).floatValue();
        }
        return brg.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float B(String str) {
        if (this.ar.containsKey(str)) {
            return ((Float) this.ar.get(str)).floatValue();
        }
        return brg.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float C(String str) {
        HashMap hashMap = this.at;
        if (hashMap != null && hashMap.containsKey(str)) {
            return ((Float) this.at.get(str)).floatValue();
        }
        return brg.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float D(String str) {
        if (this.aq.containsKey(str)) {
            return ((Float) this.aq.get(str)).floatValue();
        }
        return brg.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float E(String str) {
        if (this.ap.containsKey(str)) {
            return ((Float) this.ap.get(str)).floatValue();
        }
        return -1.0f;
    }

    public final void F(Object obj, float f, float f2, float f3, float f4, float f5) {
        super.z(obj);
        String obj2 = obj.toString();
        if (!Float.isNaN(f)) {
            this.ap.put(obj2, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            this.aq.put(obj2, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            this.ar.put(obj2, Float.valueOf(f3));
        }
        if (!Float.isNaN(f4)) {
            if (this.at == null) {
                this.at = new HashMap();
            }
            this.at.put(obj2, Float.valueOf(f4));
        }
        if (!Float.isNaN(f5)) {
            if (this.au == null) {
                this.au = new HashMap();
            }
            this.au.put(obj2, Float.valueOf(f5));
        }
    }
}
