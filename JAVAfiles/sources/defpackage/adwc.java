package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwc implements aijy {
    private final adfn a;
    private final adwt b;

    public adwc(adfn adfnVar, adwt adwtVar) {
        this.a = adfnVar;
        this.b = adwtVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.aijy
    public final void a(aiom aiomVar) {
        String str;
        String str2;
        char c;
        String co;
        String P;
        char c2;
        if (this.a.a()) {
            co = "IEEE-802.11;i-wlan-node-id=000000000000";
        } else {
            int a = this.b.a();
            switch (a) {
                case 1:
                case 2:
                    str = "3GPP-GERAN";
                    break;
                case 3:
                case 8:
                case 9:
                case 10:
                case 15:
                    str = "3GPP-UTRAN-FDD";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 12:
                    str = "3GPP2-1X";
                    break;
                case 11:
                case 16:
                case 18:
                case 19:
                default:
                    advr.q("Unknown mobile access. Type=%d", Integer.valueOf(a));
                    str = "";
                    break;
                case 13:
                    str = "3GPP-E-UTRAN-FDD";
                    break;
                case 14:
                    str = "3GPP2-1X-HRPD";
                    break;
                case 17:
                    str = "3GPP-UTRAN-TDD";
                    break;
                case 20:
                    str = "3GPP-NR-FDD";
                    break;
            }
            if ("3GPP2-1X".equals(str)) {
                str2 = "ci-3gpp2=00000000000000";
            } else if ("3GPP2-1X-HRPD".equals(str)) {
                str2 = "ci-3gpp2=0000000000000000000000000000000000";
            } else {
                String j = this.b.j();
                if (j != null && !j.isEmpty()) {
                    switch (str.hashCode()) {
                        case -1156537888:
                            if (str.equals("3GPP-UTRAN-FDD")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1156524434:
                            if (str.equals("3GPP-UTRAN-TDD")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 198846518:
                            if (str.equals("3GPP-NR-FDD")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 415239880:
                            if (str.equals("3GPP-GERAN")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 479728792:
                            if (str.equals("3GPP-E-UTRAN-FDD")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1 && c != 2 && c != 3 && c != 4) {
                            advr.q("Unknown network type %s", str);
                        } else {
                            str2 = a.bW(j, "utran-cell-id-3gpp=", "00000000000");
                        }
                    } else {
                        str2 = a.bW(j, "cgi-3gpp=", "00000000");
                    }
                } else {
                    advr.q("Could not obtain MNC+MCC. Cannot complete info part of P-Access-Network-Info", new Object[0]);
                }
                str2 = null;
            }
            if (str2 == null) {
                co = "";
            } else {
                co = a.co(str2, str, ";");
            }
        }
        if (!co.isEmpty() && (P = ahmc.P(aiomVar)) != null) {
            switch (P.hashCode()) {
                case -2130369783:
                    if (P.equals("INVITE")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1986360503:
                    if (P.equals("NOTIFY")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1785516855:
                    if (P.equals("UPDATE")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -993530582:
                    if (P.equals("SUBSCRIBE")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -531492226:
                    if (P.equals("OPTIONS")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 66254:
                    if (P.equals("BYE")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2251950:
                    if (P.equals("INFO")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 76389159:
                    if (P.equals("PRACK")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 77853792:
                    if (P.equals("REFER")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 92413603:
                    if (P.equals("REGISTER")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 482617583:
                    if (P.equals("PUBLISH")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1672907751:
                    if (P.equals("MESSAGE")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                    try {
                        aiomVar.q(ahmc.X("P-Access-Network-Info", co));
                        return;
                    } catch (Exception e) {
                        advr.i(e, "Exception while adding Access Info Header", new Object[0]);
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
