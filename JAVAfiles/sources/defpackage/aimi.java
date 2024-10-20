package defpackage;

import com.android.vcard.VCardBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aimi extends aimh {
    public final List a;

    public aimi() {
        this.a = new ArrayList();
    }

    @Override // defpackage.aimh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < this.a.size()) {
            stringBuffer.append(((aimh) this.a.get(i)).a());
            i++;
            if (i < this.a.size()) {
                stringBuffer.append(",");
            }
        }
        return stringBuffer.toString();
    }

    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final String c() {
        if (this.a.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (!this.c.equals("WWW-Authenticate") && !this.c.equals("Via") && !this.c.equals("Proxy-Authenticate") && !this.c.equals("Authorization") && !this.c.equals("Proxy-Authorization")) {
            return this.c + ": " + a() + VCardBuilder.VCARD_END_OF_LINE;
        }
        for (int i = 0; i < this.a.size(); i++) {
            stringBuffer.append(((aimh) this.a.get(i)).c());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.aimh, defpackage.aiku
    public Object clone() {
        aimi aimiVar = new aimi();
        String str = this.c;
        if (str != null) {
            aimiVar.c = str;
        }
        String str2 = this.d;
        if (str2 != null) {
            aimiVar.d = str2;
        }
        for (int i = 0; i < this.a.size(); i++) {
            aimiVar.a.add(((aimh) this.a.get(i)).clone());
        }
        return aimiVar;
    }

    @Override // defpackage.aimh
    public final aila d() {
        return null;
    }

    public final aimh e(int i) {
        return (aimh) this.a.get(i);
    }

    @Override // defpackage.aimh
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof aimi) && this.a.equals(((aimi) obj).a)) {
            return super.equals(obj);
        }
        return false;
    }

    public final aimh f() {
        if (this.a.size() == 0) {
            return null;
        }
        return (aimh) this.a.get(0);
    }

    public final void g(aimh aimhVar) {
        if (this.c.equals(aimhVar.c)) {
            this.a.add(aimhVar);
            return;
        }
        throw new IllegalArgumentException("bad type");
    }

    @Override // defpackage.aimh
    public final int hashCode() {
        int hashCode = super.hashCode();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 37) + ((aimh) it.next()).hashCode();
        }
        return hashCode;
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public aimi(String str) {
        this.a = new ArrayList();
        this.c = str;
    }

    public aimi(aimh... aimhVarArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        aimh aimhVar = aimhVarArr[0];
        if (aimhVar == null) {
            return;
        }
        this.c = aimhVar.c;
        Collections.addAll(arrayList, aimhVarArr);
    }
}
