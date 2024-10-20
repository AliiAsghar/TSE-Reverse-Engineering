package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frv extends fry {
    private final int e;
    private final frt[] f;
    private frt g;
    private List h;
    private List i;
    private fru j;
    private int k;
    private final euf a = new euf();
    private final fjl l = new fjl((byte[]) null);
    private int d = -1;

    public frv(int i, List list) {
        this.e = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = etj.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f = new frt[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f[i2] = new frt();
        }
        this.g = this.f[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List k() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frv.k():java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0133. Please report as an issue. */
    private final void l() {
        int i;
        char c;
        boolean z;
        fru fruVar = this.j;
        if (fruVar != null) {
            int i2 = fruVar.b;
            int i3 = fruVar.d;
            int i4 = (i2 + i2) - 1;
            if (i3 != i4) {
                eub.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + i4 + ", but current index is " + i3 + " (sequence number " + fruVar.a + ");");
            }
            fjl fjlVar = this.l;
            fru fruVar2 = this.j;
            fjlVar.p(fruVar2.c, fruVar2.d);
            boolean z2 = false;
            while (true) {
                if (this.l.f() > 0) {
                    fjl fjlVar2 = this.l;
                    int i5 = 3;
                    int i6 = fjlVar2.i(3);
                    int i7 = fjlVar2.i(5);
                    int i8 = 7;
                    if (i6 == 7) {
                        this.l.s(2);
                        i6 = this.l.i(6);
                        if (i6 < 7) {
                            eub.f("Cea708Decoder", a.bV(i6, "Invalid extended service number: "));
                        }
                    }
                    if (i7 == 0) {
                        if (i6 != 0) {
                            eub.f("Cea708Decoder", a.cb(i6, "serviceNumber is non-zero (", ") when blockSize is 0"));
                        }
                    } else if (i6 != this.e) {
                        this.l.t(i7);
                    } else {
                        int h = this.l.h() + (i7 * 8);
                        while (this.l.h() < h) {
                            int i9 = this.l.i(8);
                            if (i9 != 16) {
                                if (i9 <= 31) {
                                    if (i9 != 0) {
                                        if (i9 != i5) {
                                            if (i9 != 8) {
                                                switch (i9) {
                                                    case 12:
                                                        m();
                                                        break;
                                                    case 13:
                                                        this.g.c('\n');
                                                        break;
                                                    case 14:
                                                        break;
                                                    default:
                                                        if (i9 >= 17 && i9 <= 23) {
                                                            eub.f("Cea708Decoder", a.bV(i9, "Currently unsupported COMMAND_EXT1 Command: "));
                                                            this.l.s(8);
                                                            break;
                                                        } else if (i9 >= 24) {
                                                            eub.f("Cea708Decoder", a.bV(i9, "Currently unsupported COMMAND_P16 Command: "));
                                                            this.l.s(16);
                                                            break;
                                                        } else {
                                                            eub.f("Cea708Decoder", a.bV(i9, "Invalid C0 command: "));
                                                            break;
                                                        }
                                                }
                                                c = 6;
                                                i8 = i;
                                            } else {
                                                frt frtVar = this.g;
                                                int length = frtVar.l.length();
                                                if (length > 0) {
                                                    frtVar.l.delete(length - 1, length);
                                                }
                                            }
                                        } else {
                                            this.h = k();
                                        }
                                    }
                                    i = i8;
                                    c = 6;
                                    i8 = i;
                                } else {
                                    if (i9 <= 127) {
                                        if (i9 == 127) {
                                            this.g.c((char) 9835);
                                        } else {
                                            this.g.c((char) (i9 & 255));
                                        }
                                    } else {
                                        if (i9 <= 159) {
                                            switch (i9) {
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                    z = true;
                                                    int i10 = i9 - 128;
                                                    if (this.k != i10) {
                                                        this.k = i10;
                                                        this.g = this.f[i10];
                                                        break;
                                                    }
                                                    break;
                                                case 136:
                                                    z = true;
                                                    for (int i11 = 1; i11 <= 8; i11++) {
                                                        if (this.l.u()) {
                                                            this.f[8 - i11].d();
                                                        }
                                                    }
                                                    break;
                                                case 137:
                                                    for (int i12 = 1; i12 <= 8; i12++) {
                                                        if (this.l.u()) {
                                                            this.f[8 - i12].n = true;
                                                        }
                                                    }
                                                    z = true;
                                                    break;
                                                case 138:
                                                    for (int i13 = 1; i13 <= 8; i13++) {
                                                        if (this.l.u()) {
                                                            this.f[8 - i13].n = false;
                                                        }
                                                    }
                                                    z2 = true;
                                                    i8 = 7;
                                                    break;
                                                case 139:
                                                    for (int i14 = 1; i14 <= 8; i14++) {
                                                        if (this.l.u()) {
                                                            this.f[8 - i14].n = !r2.n;
                                                        }
                                                    }
                                                    z2 = true;
                                                    i8 = 7;
                                                    break;
                                                case 140:
                                                    for (int i15 = 1; i15 <= 8; i15++) {
                                                        if (this.l.u()) {
                                                            this.f[8 - i15].e();
                                                        }
                                                    }
                                                    z2 = true;
                                                    i8 = 7;
                                                    break;
                                                case 141:
                                                    this.l.s(8);
                                                    z2 = true;
                                                    i8 = 7;
                                                    break;
                                                case 142:
                                                    break;
                                                case 143:
                                                    m();
                                                    z2 = true;
                                                    i8 = 7;
                                                    break;
                                                case 144:
                                                    if (!this.g.m) {
                                                        this.l.s(16);
                                                        z2 = true;
                                                        i5 = 3;
                                                        i8 = 7;
                                                        break;
                                                    } else {
                                                        fjl fjlVar3 = this.l;
                                                        fjlVar3.i(4);
                                                        fjlVar3.i(2);
                                                        fjlVar3.i(2);
                                                        boolean u = fjlVar3.u();
                                                        boolean u2 = fjlVar3.u();
                                                        i5 = 3;
                                                        fjlVar3.i(3);
                                                        fjlVar3.i(3);
                                                        this.g.g(u, u2);
                                                        z2 = true;
                                                        i8 = 7;
                                                    }
                                                case 145:
                                                    if (!this.g.m) {
                                                        this.l.s(24);
                                                    } else {
                                                        fjl fjlVar4 = this.l;
                                                        int a = frt.a(fjlVar4.i(2), fjlVar4.i(2), fjlVar4.i(2), fjlVar4.i(2));
                                                        fjl fjlVar5 = this.l;
                                                        int a2 = frt.a(fjlVar5.i(2), fjlVar5.i(2), fjlVar5.i(2), fjlVar5.i(2));
                                                        this.l.s(2);
                                                        fjl fjlVar6 = this.l;
                                                        frt.j(fjlVar6.i(2), fjlVar6.i(2), fjlVar6.i(2));
                                                        this.g.h(a, a2);
                                                    }
                                                    z2 = true;
                                                    i5 = 3;
                                                    i8 = 7;
                                                    break;
                                                case 146:
                                                    if (!this.g.m) {
                                                        this.l.s(16);
                                                    } else {
                                                        this.l.s(4);
                                                        fjl fjlVar7 = this.l;
                                                        int i16 = fjlVar7.i(4);
                                                        fjlVar7.s(2);
                                                        this.l.i(6);
                                                        frt frtVar2 = this.g;
                                                        if (frtVar2.y != i16) {
                                                            frtVar2.c('\n');
                                                        }
                                                        frtVar2.y = i16;
                                                    }
                                                    z2 = true;
                                                    i5 = 3;
                                                    i8 = 7;
                                                    break;
                                                case 147:
                                                case 148:
                                                case 149:
                                                case 150:
                                                default:
                                                    z = true;
                                                    eub.f("Cea708Decoder", a.bV(i9, "Invalid C1 command: "));
                                                    break;
                                                case 151:
                                                    if (!this.g.m) {
                                                        this.l.s(32);
                                                    } else {
                                                        fjl fjlVar8 = this.l;
                                                        int a3 = frt.a(fjlVar8.i(2), fjlVar8.i(2), fjlVar8.i(2), fjlVar8.i(2));
                                                        fjl fjlVar9 = this.l;
                                                        fjlVar9.i(2);
                                                        frt.j(fjlVar9.i(2), fjlVar9.i(2), fjlVar9.i(2));
                                                        this.l.u();
                                                        fjl fjlVar10 = this.l;
                                                        fjlVar10.u();
                                                        fjlVar10.i(2);
                                                        this.l.i(2);
                                                        int i17 = this.l.i(2);
                                                        this.l.s(8);
                                                        this.g.i(a3, i17);
                                                    }
                                                    z2 = true;
                                                    i5 = 3;
                                                    i8 = 7;
                                                    break;
                                                case 152:
                                                case 153:
                                                case 154:
                                                case 155:
                                                case 156:
                                                case 157:
                                                case 158:
                                                case 159:
                                                    int i18 = i9 - 152;
                                                    frt[] frtVarArr = this.f;
                                                    fjl fjlVar11 = this.l;
                                                    frt frtVar3 = frtVarArr[i18];
                                                    fjlVar11.s(2);
                                                    fjl fjlVar12 = this.l;
                                                    boolean u3 = fjlVar12.u();
                                                    fjlVar12.s(2);
                                                    fjl fjlVar13 = this.l;
                                                    int i19 = fjlVar13.i(i5);
                                                    boolean u4 = fjlVar13.u();
                                                    int i20 = fjlVar13.i(i8);
                                                    int i21 = fjlVar13.i(8);
                                                    int i22 = fjlVar13.i(4);
                                                    int i23 = fjlVar13.i(4);
                                                    fjlVar13.s(2);
                                                    this.l.s(6);
                                                    this.l.s(2);
                                                    fjl fjlVar14 = this.l;
                                                    int i24 = fjlVar14.i(i5);
                                                    int i25 = fjlVar14.i(i5);
                                                    frtVar3.m = true;
                                                    frtVar3.n = u3;
                                                    frtVar3.o = i19;
                                                    frtVar3.p = u4;
                                                    frtVar3.q = i20;
                                                    frtVar3.r = i21;
                                                    frtVar3.s = i22;
                                                    int i26 = i23 + 1;
                                                    if (frtVar3.t != i26) {
                                                        frtVar3.t = i26;
                                                        while (true) {
                                                            if (frtVar3.k.size() >= frtVar3.t || frtVar3.k.size() >= 15) {
                                                                frtVar3.k.remove(0);
                                                            }
                                                        }
                                                    }
                                                    if (i24 != 0 && frtVar3.v != i24) {
                                                        frtVar3.v = i24;
                                                        int i27 = i24 - 1;
                                                        int i28 = frt.g[i27];
                                                        boolean z3 = frt.f[i27];
                                                        int i29 = frt.d[i27];
                                                        int i30 = frt.e[i27];
                                                        frtVar3.i(i28, frt.c[i27]);
                                                    }
                                                    if (i25 != 0 && frtVar3.w != i25) {
                                                        frtVar3.w = i25;
                                                        int i31 = i25 - 1;
                                                        int i32 = frt.i[i31];
                                                        int i33 = frt.h[i31];
                                                        frtVar3.g(false, false);
                                                        frtVar3.h(frt.a, frt.j[i31]);
                                                    }
                                                    if (this.k != i18) {
                                                        this.k = i18;
                                                        this.g = this.f[i18];
                                                    }
                                                    z2 = true;
                                                    i5 = 3;
                                                    i8 = 7;
                                                    break;
                                            }
                                        } else {
                                            z = true;
                                            if (i9 <= 255) {
                                                this.g.c((char) (i9 & 255));
                                            } else {
                                                eub.f("Cea708Decoder", a.bV(i9, "Invalid base command: "));
                                                c = 6;
                                                i = 7;
                                                i8 = i;
                                            }
                                        }
                                        z2 = z;
                                        i8 = 7;
                                    }
                                    z2 = true;
                                }
                            } else {
                                int i34 = this.l.i(8);
                                if (i34 <= 31) {
                                    i = 7;
                                    if (i34 > 7) {
                                        if (i34 <= 15) {
                                            this.l.s(8);
                                        } else if (i34 <= 23) {
                                            this.l.s(16);
                                        } else {
                                            this.l.s(24);
                                        }
                                    }
                                } else {
                                    i = 7;
                                    if (i34 <= 127) {
                                        if (i34 != 32) {
                                            if (i34 != 33) {
                                                if (i34 != 37) {
                                                    if (i34 != 42) {
                                                        if (i34 != 44) {
                                                            if (i34 != 63) {
                                                                if (i34 != 57) {
                                                                    if (i34 != 58) {
                                                                        if (i34 != 60) {
                                                                            if (i34 != 61) {
                                                                                switch (i34) {
                                                                                    case 48:
                                                                                        this.g.c((char) 9608);
                                                                                        break;
                                                                                    case 49:
                                                                                        this.g.c((char) 8216);
                                                                                        break;
                                                                                    case 50:
                                                                                        this.g.c((char) 8217);
                                                                                        break;
                                                                                    case 51:
                                                                                        this.g.c((char) 8220);
                                                                                        break;
                                                                                    case 52:
                                                                                        this.g.c((char) 8221);
                                                                                        break;
                                                                                    case 53:
                                                                                        this.g.c((char) 8226);
                                                                                        break;
                                                                                    default:
                                                                                        switch (i34) {
                                                                                            case 118:
                                                                                                this.g.c((char) 8539);
                                                                                                break;
                                                                                            case 119:
                                                                                                this.g.c((char) 8540);
                                                                                                break;
                                                                                            case 120:
                                                                                                this.g.c((char) 8541);
                                                                                                break;
                                                                                            case 121:
                                                                                                this.g.c((char) 8542);
                                                                                                break;
                                                                                            case 122:
                                                                                                this.g.c((char) 9474);
                                                                                                break;
                                                                                            case 123:
                                                                                                this.g.c((char) 9488);
                                                                                                break;
                                                                                            case 124:
                                                                                                this.g.c((char) 9492);
                                                                                                break;
                                                                                            case 125:
                                                                                                this.g.c((char) 9472);
                                                                                                break;
                                                                                            case 126:
                                                                                                this.g.c((char) 9496);
                                                                                                break;
                                                                                            case 127:
                                                                                                this.g.c((char) 9484);
                                                                                                break;
                                                                                            default:
                                                                                                eub.f("Cea708Decoder", a.bV(i34, "Invalid G2 character: "));
                                                                                                break;
                                                                                        }
                                                                                }
                                                                            } else {
                                                                                this.g.c((char) 8480);
                                                                            }
                                                                        } else {
                                                                            this.g.c((char) 339);
                                                                        }
                                                                    } else {
                                                                        this.g.c((char) 353);
                                                                    }
                                                                } else {
                                                                    this.g.c((char) 8482);
                                                                }
                                                            } else {
                                                                this.g.c((char) 376);
                                                            }
                                                        } else {
                                                            this.g.c((char) 338);
                                                        }
                                                    } else {
                                                        this.g.c((char) 352);
                                                    }
                                                } else {
                                                    this.g.c((char) 8230);
                                                }
                                            } else {
                                                this.g.c((char) 160);
                                            }
                                        } else {
                                            this.g.c(' ');
                                        }
                                        z2 = true;
                                        i8 = 7;
                                    } else {
                                        if (i34 <= 159) {
                                            if (i34 <= 135) {
                                                this.l.s(32);
                                            } else if (i34 <= 143) {
                                                this.l.s(40);
                                            } else {
                                                this.l.s(2);
                                                c = 6;
                                                this.l.s(this.l.i(6) * 8);
                                            }
                                        } else {
                                            c = 6;
                                            if (i34 <= 255) {
                                                if (i34 == 160) {
                                                    this.g.c((char) 13252);
                                                } else {
                                                    eub.f("Cea708Decoder", a.bV(i34, "Invalid G3 character: "));
                                                    this.g.c('_');
                                                }
                                                z2 = true;
                                            } else {
                                                eub.f("Cea708Decoder", a.bV(i34, "Invalid extended command: "));
                                            }
                                        }
                                        i8 = i;
                                    }
                                }
                                c = 6;
                                i8 = i;
                            }
                        }
                    }
                }
            }
            if (z2) {
                this.h = k();
            }
            this.j = null;
        }
    }

    private final void m() {
        for (int i = 0; i < 8; i++) {
            this.f[i].e();
        }
    }

    @Override // defpackage.fry, defpackage.ewi
    public final void c() {
        super.c();
        this.h = null;
        this.i = null;
        this.k = 0;
        this.g = this.f[0];
        m();
        this.j = null;
    }

    @Override // defpackage.fry
    protected final frc g() {
        List list = this.h;
        this.i = list;
        dzg.g(list);
        return new frz(list);
    }

    @Override // defpackage.fry
    protected final void i(frf frfVar) {
        fru fruVar;
        ByteBuffer byteBuffer = frfVar.d;
        dzg.g(byteBuffer);
        this.a.H(byteBuffer.array(), byteBuffer.limit());
        while (this.a.b() >= 3) {
            int j = this.a.j();
            int i = j & 3;
            byte j2 = (byte) this.a.j();
            byte j3 = (byte) this.a.j();
            if (i != 2) {
                if (i == 3) {
                    i = 3;
                }
            }
            if ((j & 4) == 4) {
                if (i == 3) {
                    l();
                    int i2 = this.d;
                    int i3 = (j2 & 192) >> 6;
                    if (i2 != -1 && i3 != (3 & (i2 + 1))) {
                        m();
                        eub.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.d + " current=" + i3);
                    }
                    this.d = i3;
                    int i4 = j2 & 63;
                    if (i4 == 0) {
                        i4 = 64;
                    }
                    fruVar = new fru(i3, i4);
                    this.j = fruVar;
                    byte[] bArr = fruVar.c;
                    int i5 = fruVar.d;
                    fruVar.d = i5 + 1;
                    bArr[i5] = j3;
                } else {
                    d.s(true);
                    fruVar = this.j;
                    if (fruVar == null) {
                        eub.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        int i6 = fruVar.d;
                        int i7 = i6 + 1;
                        fruVar.d = i7;
                        byte[] bArr2 = fruVar.c;
                        bArr2[i6] = j2;
                        fruVar.d = i6 + 2;
                        bArr2[i7] = j3;
                    }
                }
                int i8 = fruVar.d;
                int i9 = fruVar.b;
                if (i8 == (i9 + i9) - 1) {
                    l();
                }
            }
        }
    }

    @Override // defpackage.fry
    protected final boolean j() {
        if (this.h != this.i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fry, defpackage.ewi
    public final /* bridge */ /* synthetic */ void e() {
    }
}
