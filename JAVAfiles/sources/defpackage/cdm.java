package defpackage;

import defpackage.byx;
import defpackage.ccu;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdm extends cce<bwv<Object>, cax<Object>> implements Map<bwv<Object>, cax<Object>>, byx {
    public static final cdm d = new cdm(ccu.a, 0);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a extends ccg<bwv<Object>, cax<Object>> implements Map<bwv<Object>, cax<Object>>, byx.a {
        private cdm f;

        public a(cdm cdmVar) {
            super(cdmVar);
            this.f = cdmVar;
        }

        @Override // defpackage.ccg, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            if (!(obj instanceof bwv)) {
                return false;
            }
            return super.containsKey((bwv) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsValue(Object obj) {
            if (!(obj instanceof cax)) {
                return false;
            }
            return super.containsValue((cax) obj);
        }

        @Override // defpackage.ccg
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final cdm b() {
            ccu ccuVar = this.b;
            cdm cdmVar = this.f;
            if (ccuVar != cdmVar.b) {
                this.a = new cdg();
                cdmVar = new cdm(ccuVar, this.e);
            }
            this.f = cdmVar;
            return cdmVar;
        }

        @Override // defpackage.ccg, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ cax get(Object obj) {
            if (!(obj instanceof bwv)) {
                return null;
            }
            return (cax) super.get((bwv) obj);
        }

        @Override // defpackage.ccg, java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof bwv)) {
                return obj2;
            }
            return (cax) Map.CC.$default$getOrDefault(this, (bwv) obj, (cax) obj2);
        }

        @Override // defpackage.ccg, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ cax remove(Object obj) {
            if (!(obj instanceof bwv)) {
                return null;
            }
            return (cax) super.remove((bwv) obj);
        }
    }

    public cdm(ccu ccuVar, int i) {
        super(ccuVar, i);
    }

    @Override // defpackage.bww
    public final /* synthetic */ Object a(bwv bwvVar) {
        return bwz.b(this, bwvVar);
    }

    @Override // defpackage.bwy
    public final Object b(bwv bwvVar) {
        return bwz.b(this, bwvVar);
    }

    @Override // defpackage.byx
    public final /* synthetic */ byx.a c() {
        return new a(this);
    }

    @Override // defpackage.cce, defpackage.arnk, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof bwv)) {
            return false;
        }
        return super.containsKey((bwv) obj);
    }

    @Override // defpackage.arnk, java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof cax)) {
            return false;
        }
        return super.containsValue((cax) obj);
    }

    @Override // defpackage.byx
    public final byx d(bwv bwvVar, cax caxVar) {
        ccu.a d2 = this.b.d(bwvVar.hashCode(), bwvVar, caxVar, 0);
        if (d2 == null) {
            return this;
        }
        return new cdm(d2.a, this.c + d2.b);
    }

    @Override // defpackage.cce, defpackage.arnk, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof bwv)) {
            return null;
        }
        return (cax) super.get((bwv) obj);
    }

    @Override // defpackage.arnk, java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof bwv)) {
            return obj2;
        }
        return (cax) Map.CC.$default$getOrDefault(this, (bwv) obj, (cax) obj2);
    }
}
