package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimd extends aimm {
    public String a;

    public aimd() {
        super("Event");
    }

    @Override // defpackage.aimh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.a;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (!this.e.h()) {
            stringBuffer.append(";".concat(this.e.c()));
        }
        return stringBuffer.toString();
    }
}
