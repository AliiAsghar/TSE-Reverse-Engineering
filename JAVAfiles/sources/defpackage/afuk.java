package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Duration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afuk extends arpw implements arqr {
    int a;
    final /* synthetic */ aful b;
    final /* synthetic */ afdt c;
    final /* synthetic */ Uri d;
    final /* synthetic */ boolean e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afuk(aful afulVar, afdt afdtVar, Uri uri, boolean z, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.f = i;
        this.b = afulVar;
        this.c = afdtVar;
        this.d = uri;
        this.e = z;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                return new afuk(this.b, this.c, this.d, this.e, (arpe) obj, 2, (char[]) null).b(arnb.a);
            }
            return new afuk(this.b, this.c, this.d, this.e, (arpe) obj, 1, (byte[]) null).b(arnb.a);
        }
        return new afuk(this.b, this.c, this.d, this.e, (arpe) obj, 0).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.f;
        afuw afuwVar = null;
        if (i != 0) {
            if (i != 1) {
                arpl arplVar = arpl.a;
                int i2 = this.a;
                aqil.P(obj);
                if (i2 == 0) {
                    aful afulVar = this.b;
                    afdt afdtVar = this.c;
                    Uri uri = this.d;
                    boolean z = this.e;
                    this.a = 1;
                    Size a = afdtVar.a();
                    Duration b = afdtVar.b();
                    if (a != null && b != null) {
                        afux afuxVar = new afux(afdtVar.c(), a, b);
                        if (z) {
                            atsg atsgVar = afulVar.c;
                            if (aeke.br(afuxVar.b) && anbx.b(afuxVar.c)) {
                                afuwVar = afuxVar;
                            }
                            if (afuwVar == null) {
                                obj = atsgVar.t(uri, this);
                            } else {
                                obj = afuwVar;
                            }
                        } else {
                            obj = afuxVar;
                        }
                    } else {
                        obj = afulVar.c.t(uri, this);
                    }
                    if (obj == arplVar) {
                        return arplVar;
                    }
                }
                return obj;
            }
            arpl arplVar2 = arpl.a;
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                aful afulVar2 = this.b;
                afdt afdtVar2 = this.c;
                Uri uri2 = this.d;
                boolean z2 = this.e;
                this.a = 1;
                Duration b2 = afdtVar2.b();
                if (b2 == null) {
                    b2 = aful.a;
                }
                afuv afuvVar = new afuv(afdtVar2.c(), b2);
                if (anbx.b(afuvVar.b) || !z2) {
                    afuwVar = afuvVar;
                }
                if (afuwVar == null) {
                    obj = afulVar2.c.r(uri2, this);
                } else {
                    obj = afuwVar;
                }
                if (obj == arplVar2) {
                    return arplVar2;
                }
            }
            return obj;
        }
        arpl arplVar3 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            aful afulVar3 = this.b;
            afdt afdtVar3 = this.c;
            Uri uri3 = this.d;
            boolean z3 = this.e;
            this.a = 1;
            Size a2 = afdtVar3.a();
            if (a2 == null) {
                a2 = aful.b;
            }
            afuw afuwVar2 = new afuw(afdtVar3.c(), a2);
            if (aeke.br(afuwVar2.b) || !z3) {
                afuwVar = afuwVar2;
            }
            if (afuwVar == null) {
                obj = afulVar3.c.s(uri3, this);
            } else {
                obj = afuwVar;
            }
            if (obj == arplVar3) {
                return arplVar3;
            }
        }
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afuk(aful afulVar, afdt afdtVar, Uri uri, boolean z, arpe arpeVar, int i, byte[] bArr) {
        super(1, arpeVar);
        this.f = i;
        this.b = afulVar;
        this.c = afdtVar;
        this.d = uri;
        this.e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afuk(aful afulVar, afdt afdtVar, Uri uri, boolean z, arpe arpeVar, int i, char[] cArr) {
        super(1, arpeVar);
        this.f = i;
        this.b = afulVar;
        this.c = afdtVar;
        this.d = uri;
        this.e = z;
    }
}
