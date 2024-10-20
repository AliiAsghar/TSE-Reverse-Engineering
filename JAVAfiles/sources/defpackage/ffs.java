package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffs implements fft {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.fft
    public final fnt a(eqn eqnVar) {
        char c;
        String str = eqnVar.o;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c == 4) {
                                return new fnx();
                            }
                        } else {
                            return new foc();
                        }
                    } else {
                        return new fpa();
                    }
                } else {
                    return new fnz();
                }
            } else {
                return new fol(null);
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // defpackage.fft
    public final boolean b(eqn eqnVar) {
        String str = eqnVar.o;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
