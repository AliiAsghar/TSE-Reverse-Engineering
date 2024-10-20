package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fna implements fmu {
    public final alog a;
    public final int b;

    private fna(int i, alog alogVar) {
        this.b = i;
        this.a = alogVar;
    }

    public static fna c(int i, euf eufVar) {
        String str;
        int i2;
        fmu fnbVar;
        String str2;
        alob alobVar = new alob();
        int i3 = eufVar.c;
        int i4 = -2;
        while (eufVar.b() > 8) {
            int f = eufVar.f();
            int f2 = eufVar.b + eufVar.f();
            eufVar.I(f2);
            if (f == 1414744396) {
                fnbVar = c(eufVar.f(), eufVar);
            } else {
                switch (f) {
                    case 1718776947:
                        if (i4 == 2) {
                            eufVar.K(4);
                            int f3 = eufVar.f();
                            int f4 = eufVar.f();
                            eufVar.K(4);
                            int f5 = eufVar.f();
                            switch (f5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                eub.f("StreamFormatChunk", a.bV(f5, "Ignoring track with unsupported compression "));
                                break;
                            } else {
                                eqm eqmVar = new eqm();
                                eqmVar.t = f3;
                                eqmVar.u = f4;
                                eqmVar.b(str2);
                                fnbVar = new fnb(new eqn(eqmVar));
                                break;
                            }
                        } else if (i4 == 1) {
                            int h = eufVar.h();
                            if (h == 1) {
                                str = "audio/raw";
                            } else if (h != 85) {
                                if (h == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (h != 8192) {
                                    if (h != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                eub.f("StreamFormatChunk", a.bV(h, "Ignoring track with unsupported format tag "));
                                break;
                            } else {
                                int h2 = eufVar.h();
                                int f6 = eufVar.f();
                                eufVar.K(6);
                                int m = eul.m(eufVar.h());
                                if (eufVar.b() > 0) {
                                    i2 = eufVar.h();
                                } else {
                                    i2 = 0;
                                }
                                byte[] bArr = new byte[i2];
                                eufVar.E(bArr, 0, i2);
                                eqm eqmVar2 = new eqm();
                                eqmVar2.b(str);
                                eqmVar2.B = h2;
                                eqmVar2.C = f6;
                                if ("audio/raw".equals(str) && m != 0) {
                                    eqmVar2.D = m;
                                }
                                if ("audio/mp4a-latm".equals(str) && i2 > 0) {
                                    eqmVar2.p = alog.r(bArr);
                                }
                                fnbVar = new fnb(new eqn(eqmVar2));
                                break;
                            }
                        } else {
                            eub.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(eul.L(i4)));
                            break;
                        }
                    case 1751742049:
                        int f7 = eufVar.f();
                        eufVar.K(8);
                        int f8 = eufVar.f();
                        int f9 = eufVar.f();
                        eufVar.K(4);
                        eufVar.f();
                        eufVar.K(12);
                        fnbVar = new fmx(f7, f8, f9);
                        break;
                    case 1752331379:
                        int f10 = eufVar.f();
                        eufVar.K(12);
                        eufVar.f();
                        int f11 = eufVar.f();
                        int f12 = eufVar.f();
                        eufVar.K(4);
                        int f13 = eufVar.f();
                        int f14 = eufVar.f();
                        eufVar.K(8);
                        fnbVar = new fmy(f10, f11, f12, f13, f14);
                        break;
                    case 1852994675:
                        fnbVar = new fnc(eufVar.y(eufVar.b()));
                        break;
                }
                fnbVar = null;
            }
            if (fnbVar != null) {
                if (fnbVar.a() == 1752331379) {
                    int i5 = ((fmy) fnbVar).a;
                    if (i5 != 1935960438) {
                        if (i5 != 1935963489) {
                            if (i5 != 1937012852) {
                                eub.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i5))));
                                i4 = -1;
                            } else {
                                i4 = 3;
                            }
                        } else {
                            i4 = 1;
                        }
                    } else {
                        i4 = 2;
                    }
                }
                alobVar.h(fnbVar);
            }
            eufVar.J(f2);
            eufVar.I(i3);
        }
        return new fna(i, alobVar.g());
    }

    @Override // defpackage.fmu
    public final int a() {
        return this.b;
    }

    public final fmu b(Class cls) {
        fmu fmuVar;
        int i = 0;
        do {
            alog alogVar = this.a;
            if (i < ((alsx) alogVar).c) {
                fmuVar = (fmu) alogVar.get(i);
                i++;
            } else {
                return null;
            }
        } while (fmuVar.getClass() != cls);
        return fmuVar;
    }
}
