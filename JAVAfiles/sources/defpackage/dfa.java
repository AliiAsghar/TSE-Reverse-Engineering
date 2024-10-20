package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfa implements enk {
    final /* synthetic */ arwe a;
    final /* synthetic */ byv b;
    final /* synthetic */ bzj c;
    final /* synthetic */ arsb d;
    final /* synthetic */ View e;

    /* compiled from: PG */
    /* renamed from: dfa$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arsb b;
        final /* synthetic */ bzj c;
        final /* synthetic */ enm d;
        final /* synthetic */ dfa e;
        final /* synthetic */ View f;
        private /* synthetic */ Object g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: dfa$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00441 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ ascv b;
            final /* synthetic */ ddg c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00441(ascv ascvVar, ddg ddgVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = ascvVar;
                this.c = ddgVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((C00441) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                arpl arplVar = arpl.a;
                int i = this.a;
                aqil.P(obj);
                if (i == 0) {
                    ascv ascvVar = this.b;
                    final ddg ddgVar = this.c;
                    asaj asajVar = new asaj() { // from class: dfa.1.1.1
                        @Override // defpackage.asaj
                        public final /* bridge */ /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                            ddg.this.b(((Number) obj2).floatValue());
                            return arnb.a;
                        }
                    };
                    this.a = 1;
                    if (ascvVar.a(asajVar, this) == arplVar) {
                        return arplVar;
                    }
                }
                throw new armj();
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new C00441(this.b, this.c, arpeVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arsb arsbVar, bzj bzjVar, enm enmVar, dfa dfaVar, View view, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arsbVar;
            this.c = bzjVar;
            this.d = enmVar;
            this.e = dfaVar;
            this.f = view;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [arxm] */
        /* JADX WARN: Type inference failed for: r2v6 */
        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arxm arxmVar;
            ascv ascvVar;
            Object obj2 = arpl.a;
            ?? r2 = this.a;
            try {
                if (r2 != 0) {
                    arxmVar = (arxm) this.g;
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    arwe arweVar = (arwe) this.g;
                    try {
                        ddg ddgVar = (ddg) this.b.a;
                        if (ddgVar != null) {
                            Context applicationContext = this.f.getContext().getApplicationContext();
                            synchronized (dfd.a) {
                                Map map = dfd.a;
                                Object obj3 = map.get(applicationContext);
                                if (obj3 == null) {
                                    ContentResolver contentResolver = applicationContext.getContentResolver();
                                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                                    arzj t = arhi.t(-1, 0, 6);
                                    asaa asaaVar = new asaa(new dfb(contentResolver, uriFor, new dfc(t, dzg.c(Looper.getMainLooper())), t, applicationContext, null));
                                    aryj aryjVar = new aryj(null);
                                    arwb arwbVar = arws.a;
                                    asep asepVar = new asep(arhi.n(aryjVar, asfh.a));
                                    int i = ascp.a;
                                    obj3 = arrn.T(asaaVar, asepVar, asco.a(0L, 3), Float.valueOf(Settings.Global.getFloat(applicationContext.getContentResolver(), "animator_duration_scale", 1.0f)));
                                    map.put(applicationContext, obj3);
                                }
                                ascvVar = (ascv) obj3;
                            }
                            ddgVar.b(((Number) ascvVar.c()).floatValue());
                            arxmVar = arrn.J(arweVar, null, null, new C00441(ascvVar, ddgVar, null), 3);
                        } else {
                            arxmVar = null;
                        }
                        bzj bzjVar = this.c;
                        this.g = arxmVar;
                        this.a = 1;
                        Object q = arro.q(bzjVar.c, new bzo(bzjVar, new bzp(bzjVar, null), byf.a(u()), null), this);
                        Object obj4 = arpl.a;
                        if (q != obj4) {
                            q = arnb.a;
                        }
                        if (q != obj4) {
                            q = arnb.a;
                        }
                        if (q == obj2) {
                            return obj2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r2 = 0;
                        if (r2 != 0) {
                            r2.v(null);
                        }
                        this.d.N().d(this.e);
                        throw th;
                    }
                }
                if (arxmVar != null) {
                    arxmVar.v(null);
                }
                this.d.N().d(this.e);
                return arnb.a;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, this.e, this.f, arpeVar);
            anonymousClass1.g = obj;
            return anonymousClass1;
        }
    }

    public dfa(arwe arweVar, byv byvVar, bzj bzjVar, arsb arsbVar, View view) {
        this.a = arweVar;
        this.b = byvVar;
        this.c = bzjVar;
        this.d = arsbVar;
        this.e = view;
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        int ordinal = enfVar.ordinal();
        arvo arvoVar = null;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        this.c.u();
                        return;
                    }
                    return;
                }
                this.c.v();
                return;
            }
            byv byvVar = this.b;
            if (byvVar != null) {
                bxy bxyVar = byvVar.a;
                synchronized (bxyVar.a) {
                    if (!bxyVar.a()) {
                        List list = bxyVar.b;
                        bxyVar.b = bxyVar.c;
                        bxyVar.c = list;
                        bxyVar.d = true;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((arpe) list.get(i)).w(arnb.a);
                        }
                        list.clear();
                    }
                }
            }
            bzj bzjVar = this.c;
            synchronized (bzjVar.d) {
                if (bzjVar.m) {
                    bzjVar.m = false;
                    arvoVar = bzjVar.t();
                }
            }
            if (arvoVar != null) {
                arvoVar.w(arnb.a);
                return;
            }
            return;
        }
        arrn.J(this.a, null, arwf.d, new AnonymousClass1(this.d, this.c, enmVar, this, this.e, null), 1);
    }
}
