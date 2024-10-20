package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ailq extends aimm {
    public aikn a;

    public ailq(String str) {
        super(str);
    }

    @Override // defpackage.aimh
    public String a() {
        if (this.a != null) {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.a.c != 1) {
                stringBuffer.append("<");
            }
            stringBuffer.append(this.a.c());
            if (this.a.c != 1) {
                stringBuffer.append(">");
            }
            if (!this.e.h()) {
                stringBuffer.append(";");
                stringBuffer.append(this.e.c());
            }
            return stringBuffer.toString();
        }
        throw new RuntimeException("No body!");
    }

    public void b(aikn aiknVar) {
        this.a = aiknVar;
    }

    @Override // defpackage.aimh, defpackage.aiku
    public Object clone() {
        ailq ailqVar = new ailq(this.c);
        aikn aiknVar = this.a;
        if (aiknVar != null) {
            ailqVar.a = aiknVar;
        }
        aila ailaVar = this.e;
        if (ailaVar != null) {
            ailqVar.e = ailaVar;
        }
        return ailqVar;
    }

    @Override // defpackage.aimm, defpackage.aimh
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ailq)) {
            ailq ailqVar = (ailq) obj;
            aikn aiknVar = this.a;
            if (aiknVar != null || ailqVar.a == null) {
                if (aiknVar == null || aiknVar.equals(ailqVar.a)) {
                    return super.equals(obj);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.aimm, defpackage.aimh
    public int hashCode() {
        int hashCode = super.hashCode();
        aikn aiknVar = this.a;
        if (aiknVar != null) {
            return (hashCode * 37) + aiknVar.hashCode();
        }
        return hashCode;
    }

    public ailq(String str, aikn aiknVar) {
        super(str);
        this.a = aiknVar;
    }
}
