package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fri implements frj {
    private final /* synthetic */ int b;

    public fri(int i) {
        this.b = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.frj
    public final int a(eqn eqnVar) {
        char c;
        if (this.b == 0) {
            return 1;
        }
        String str = eqnVar.o;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                case 5:
                case 6:
                    return 2;
                case 7:
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0061. Please report as an issue. */
    @Override // defpackage.frj
    public final frl b(eqn eqnVar) {
        char c;
        frl fshVar;
        if (this.b != 0) {
            String str = eqnVar.o;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        fshVar = new fsh(eqnVar.r);
                        return fshVar;
                    case 1:
                        return new ftd();
                    case 2:
                        return new fsw();
                    case 3:
                        return new fsl();
                    case 4:
                        fshVar = new fsv(eqnVar.r);
                        return fshVar;
                    case 5:
                        return new fsf();
                    case 6:
                        fshVar = new fsd(eqnVar.r);
                        return fshVar;
                    case 7:
                        return new fsr();
                }
            }
            throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
        }
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.frj
    public final boolean c(eqn eqnVar) {
        if (this.b == 0) {
            return false;
        }
        String str = eqnVar.o;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }
}
