package defpackage;

import android.content.Context;
import android.telephony.CellIdentityCdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.ServiceState;
import android.telephony.cdma.CdmaCellLocation;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmp extends acmo {
    private static final advp d = new advp("MobileNetworkAccess");
    private static final acyz e = aczd.a(184659928);
    private static final acyz f = aczd.a(184656641);
    private static final acyz g = aczd.a(340231737);
    final adwt c;

    public acmp(Context context) {
        this.c = adwt.g(context);
    }

    private static final String h(int i) {
        String upperCase = Integer.toHexString(i).toUpperCase(Locale.US);
        int length = 4 - upperCase.length();
        if (length < 0) {
            advr.r(d, "incorrect expected bits %d for number: %d", 16, Integer.valueOf(i));
            return upperCase;
        }
        if (length > 0) {
            StringBuilder sb = new StringBuilder(upperCase);
            for (int i2 = 0; i2 < length; i2++) {
                sb.insert(0, 0);
            }
            return sb.toString();
        }
        return upperCase;
    }

    @Override // defpackage.acmo
    public final String a() {
        CdmaCellLocation cdmaCellLocation;
        int i;
        int i2;
        int i3;
        String b = b();
        List<CellInfo> list = null;
        int i4 = 0;
        if (b != null && ("3GPP-GERAN".equals(b) || b.startsWith("3GPP-UTRAN") || b.startsWith("3GPP-E-UTRAN") || "3GPP-NR-FDD".equals(b))) {
            String j = this.c.j();
            if (j != null && !j.equals("")) {
                if ("3GPP-GERAN".equals(b)) {
                    return a.bW(j, "cgi-3gpp=", "00000000");
                }
                if (!"3GPP-UTRAN-FDD".equals(b) && !"3GPP-UTRAN-TDD".equals(b)) {
                    if (!b.startsWith("3GPP-E-UTRAN") && !b.equals("3GPP-NR-FDD")) {
                        return null;
                    }
                    return a.bW(j, "utran-cell-id-3gpp=", "00000000000");
                }
                return a.bW(j, "utran-cell-id-3gpp=", "00000000000");
            }
            advr.r(d, "Could not obtain MNC+MCC. Cannot complete info part of P-Access-Network-Info", new Object[0]);
            return null;
        }
        if (!"3GPP2-1X".equals(b)) {
            return null;
        }
        if (((Boolean) f.a()).booleanValue()) {
            return "ci-3gpp2=00000000000000";
        }
        adwt adwtVar = this.c;
        try {
            try {
                cdmaCellLocation = (CdmaCellLocation) adwtVar.a.getCellLocation();
            } catch (SecurityException e2) {
                throw new adwk("ACCESS_FINE_LOCATION permission is missing.", e2);
            }
        } catch (adwk e3) {
            advr.t(e3, d, "Can't get cell location, missing permissions.", new Object[0]);
            cdmaCellLocation = null;
        }
        if (cdmaCellLocation != null) {
            i = cdmaCellLocation.getSystemId();
            i2 = cdmaCellLocation.getNetworkId();
            i3 = cdmaCellLocation.getBaseStationId();
        } else {
            try {
                try {
                    list = adwtVar.a.getAllCellInfo();
                } catch (SecurityException e4) {
                    throw new adwk("ACCESS_FINE_LOCATION permission is missing.", e4);
                }
            } catch (adwk e5) {
                advr.t(e5, d, "Can't get all cell info, missing permissions.", new Object[0]);
            }
            if (list != null) {
                for (CellInfo cellInfo : list) {
                    if (cellInfo instanceof CellInfoCdma) {
                        CellIdentityCdma cellIdentity = ((CellInfoCdma) cellInfo).getCellIdentity();
                        int systemId = cellIdentity.getSystemId();
                        int networkId = cellIdentity.getNetworkId();
                        i3 = cellIdentity.getBasestationId();
                        i = systemId;
                        i2 = networkId;
                        break;
                    }
                }
            }
            i = -1;
            i2 = -1;
            i3 = -1;
        }
        if (i == -1) {
            i = 0;
        }
        if (i2 == -1) {
            i2 = 0;
        }
        if (i3 != -1) {
            i4 = i3;
        }
        return "ci-3gpp2=" + h(i) + h(i2) + "00" + h(i4);
    }

    @Override // defpackage.acmo
    public final String b() {
        int duplexMode;
        int c = this.c.c();
        ServiceState serviceState = null;
        switch (c) {
            case 1:
            case 2:
                return "3GPP-GERAN";
            case 3:
            case 8:
            case 9:
            case 10:
            case 15:
                return "3GPP-UTRAN-FDD";
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
                return "3GPP2-1X";
            case 11:
            case 16:
            case 18:
            case 19:
            default:
                advr.r(d, "Unknown mobile access. Type=%d", Integer.valueOf(c));
                return null;
            case 13:
                if (((Boolean) e.a()).booleanValue()) {
                    return "3GPP-E-UTRAN-FDD";
                }
                if (yhx.b) {
                    try {
                        serviceState = this.c.a.getServiceState();
                    } catch (SecurityException unused) {
                    }
                    if (serviceState != null) {
                        duplexMode = serviceState.getDuplexMode();
                        if (duplexMode == 1) {
                            return "3GPP-E-UTRAN-FDD";
                        }
                    }
                }
                return "3GPP-E-UTRAN-TDD";
            case 14:
                return "3GPP2-1X-HRPD";
            case 17:
                return "3GPP-UTRAN-TDD";
            case 20:
                if (!((Boolean) g.a()).booleanValue()) {
                    advr.r(d, "5G NR mobile access type disabled. Type=%d", Integer.valueOf(c));
                    return null;
                }
                return "3GPP-NR-FDD";
        }
    }
}
