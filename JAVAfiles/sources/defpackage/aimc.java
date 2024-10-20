package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimc extends aimh implements Cloneable {
    public Calendar a;

    public aimc() {
        super("Date");
        this.a = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"));
    }

    @Override // defpackage.aimh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = null;
        switch (this.a.get(7)) {
            case 1:
                stringBuffer.append("Sun");
                break;
            case 2:
                stringBuffer.append("Mon");
                break;
            case 3:
                stringBuffer.append("Tue");
                break;
            case 4:
                stringBuffer.append("Wed");
                break;
            case 5:
                stringBuffer.append("Thu");
                break;
            case 6:
                stringBuffer.append("Fri");
                break;
            case 7:
                stringBuffer.append("Sat");
                break;
        }
        int i = this.a.get(5);
        if (i < 10) {
            stringBuffer.append(a.bV(i, ", 0"));
        } else {
            stringBuffer.append(a.bV(i, ", "));
        }
        stringBuffer.append(" ");
        switch (this.a.get(2)) {
            case 0:
                stringBuffer.append("Jan");
                break;
            case 1:
                stringBuffer.append("Feb");
                break;
            case 2:
                stringBuffer.append("Mar");
                break;
            case 3:
                stringBuffer.append("Apr");
                break;
            case 4:
                stringBuffer.append("May");
                break;
            case 5:
                stringBuffer.append("Jun");
                break;
            case 6:
                stringBuffer.append("Jul");
                break;
            case 7:
                stringBuffer.append("Aug");
                break;
            case 8:
                stringBuffer.append("Sep");
                break;
            case 9:
                stringBuffer.append("Oct");
                break;
            case 10:
                stringBuffer.append("Nov");
                break;
            case 11:
                stringBuffer.append("Dec");
                break;
        }
        stringBuffer.append(" ");
        stringBuffer.append(this.a.get(1));
        stringBuffer.append(" ");
        int i2 = this.a.get(11);
        if (i2 < 10) {
            stringBuffer.append(a.bV(i2, "0"));
        } else {
            stringBuffer.append(i2);
        }
        stringBuffer.append(":");
        int i3 = this.a.get(12);
        if (i3 < 10) {
            stringBuffer.append(a.bV(i3, "0"));
        } else {
            stringBuffer.append(i3);
        }
        stringBuffer.append(":");
        int i4 = this.a.get(13);
        if (i4 < 10) {
            stringBuffer.append(a.bV(i4, "0"));
        } else {
            stringBuffer.append(i4);
        }
        stringBuffer.append(" GMT");
        str = stringBuffer.toString();
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Encoding calendar would return null.");
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        aimc aimcVar = new aimc();
        aimcVar.a.setTime(this.a.getTime());
        return aimcVar;
    }

    @Override // defpackage.aimh
    public final aila d() {
        return null;
    }
}
