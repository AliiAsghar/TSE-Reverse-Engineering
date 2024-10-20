package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsf implements frl {
    private final euf a = new euf();
    private final euf b = new euf();
    private final fse c = new fse();
    private Inflater d;

    @Override // defpackage.frl
    public final /* synthetic */ frc a(byte[] bArr, int i, int i2) {
        return fsm.b(this, bArr, i2);
    }

    @Override // defpackage.frl
    public final void b(byte[] bArr, int i, int i2, frk frkVar, etm etmVar) {
        esz eszVar;
        euf eufVar;
        euf eufVar2;
        int i3;
        int i4;
        int i5;
        int l;
        fsf fsfVar = this;
        fsfVar.a.H(bArr, i + i2);
        fsfVar.a.J(i);
        euf eufVar3 = fsfVar.a;
        if (eufVar3.b() > 0 && eufVar3.d() == 120) {
            if (fsfVar.d == null) {
                fsfVar.d = new Inflater();
            }
            if (eul.T(eufVar3, fsfVar.b, fsfVar.d)) {
                euf eufVar4 = fsfVar.b;
                eufVar3.H(eufVar4.a, eufVar4.c);
            }
        }
        fsfVar.c.a();
        ArrayList arrayList = new ArrayList();
        while (true) {
            euf eufVar5 = fsfVar.a;
            if (eufVar5.b() >= 3) {
                fse fseVar = fsfVar.c;
                int i6 = eufVar5.c;
                int j = eufVar5.j();
                int n = eufVar5.n();
                int i7 = eufVar5.b + n;
                if (i7 > i6) {
                    eufVar5.J(i6);
                    eszVar = null;
                } else {
                    if (j != 128) {
                        switch (j) {
                            case 20:
                                if (n % 5 == 2) {
                                    eufVar5.K(2);
                                    Arrays.fill(fseVar.b, 0);
                                    int i8 = n / 5;
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        int j2 = eufVar5.j();
                                        int j3 = eufVar5.j();
                                        int j4 = eufVar5.j();
                                        int j5 = eufVar5.j();
                                        int j6 = eufVar5.j();
                                        double d = j3;
                                        double d2 = j4 - 128;
                                        euf eufVar6 = eufVar5;
                                        double d3 = j5 - 128;
                                        fseVar.b[j2] = (eul.d((int) (d + (1.402d * d2)), 0, 255) << 16) | (j6 << 24) | (eul.d((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | eul.d((int) (d + (d3 * 1.772d)), 0, 255);
                                        i9++;
                                        i8 = i8;
                                        eufVar5 = eufVar6;
                                        fseVar = fseVar;
                                    }
                                    fseVar.c = true;
                                    eufVar = eufVar5;
                                    break;
                                }
                                break;
                            case 21:
                                if (n >= 4) {
                                    eufVar5.K(3);
                                    int i10 = n - 4;
                                    if ((eufVar5.j() & 128) != 0) {
                                        if (i10 >= 7 && (l = eufVar5.l()) >= 4) {
                                            fseVar.h = eufVar5.n();
                                            fseVar.i = eufVar5.n();
                                            fseVar.a.F(l - 4);
                                            i10 = n - 11;
                                        }
                                    }
                                    euf eufVar7 = fseVar.a;
                                    int i11 = eufVar7.b;
                                    int i12 = eufVar7.c;
                                    if (i11 < i12 && i10 > 0) {
                                        int min = Math.min(i10, i12 - i11);
                                        eufVar5.E(eufVar7.a, i11, min);
                                        fseVar.a.J(i11 + min);
                                        break;
                                    }
                                }
                                break;
                            case 22:
                                if (n >= 19) {
                                    fseVar.d = eufVar5.n();
                                    fseVar.e = eufVar5.n();
                                    eufVar5.K(11);
                                    fseVar.f = eufVar5.n();
                                    fseVar.g = eufVar5.n();
                                    break;
                                }
                                break;
                        }
                        eufVar = eufVar5;
                        eszVar = null;
                    } else {
                        if (fseVar.d != 0 && fseVar.e != 0 && fseVar.h != 0 && fseVar.i != 0 && (i3 = (eufVar2 = fseVar.a).c) != 0 && eufVar2.b == i3 && fseVar.c) {
                            eufVar2.J(0);
                            int i13 = fseVar.h * fseVar.i;
                            int[] iArr = new int[i13];
                            int i14 = 0;
                            while (i14 < i13) {
                                int j7 = fseVar.a.j();
                                if (j7 != 0) {
                                    i4 = i14 + 1;
                                    iArr[i14] = fseVar.b[j7];
                                } else {
                                    int j8 = fseVar.a.j();
                                    if (j8 != 0) {
                                        int i15 = j8 & 63;
                                        if ((j8 & 64) != 0) {
                                            i15 = (i15 << 8) | fseVar.a.j();
                                        }
                                        if ((j8 & 128) == 0) {
                                            i5 = fseVar.b[0];
                                        } else {
                                            i5 = fseVar.b[fseVar.a.j()];
                                        }
                                        i4 = i15 + i14;
                                        Arrays.fill(iArr, i14, i4, i5);
                                    }
                                }
                                i14 = i4;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr, fseVar.h, fseVar.i, Bitmap.Config.ARGB_8888);
                            esy esyVar = new esy();
                            esyVar.b = createBitmap;
                            esyVar.f = fseVar.f / fseVar.d;
                            esyVar.g = 0;
                            esyVar.c(fseVar.g / fseVar.e, 0);
                            esyVar.e = 0;
                            esyVar.h = fseVar.h / fseVar.d;
                            esyVar.i = fseVar.i / fseVar.e;
                            eszVar = esyVar.a();
                        } else {
                            eszVar = null;
                        }
                        fseVar.a();
                        eufVar = eufVar5;
                    }
                    eufVar.J(i7);
                }
                if (eszVar != null) {
                    arrayList.add(eszVar);
                }
                fsfVar = this;
            } else {
                etmVar.a(new xab(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }

    @Override // defpackage.frl
    public final /* synthetic */ void c() {
    }
}
