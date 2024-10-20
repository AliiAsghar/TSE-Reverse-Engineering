package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwq implements dwo {
    public final dwy d;
    public int e;
    public int f;
    public dwo a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    dwr h = null;
    public boolean i = false;
    public final List j = new ArrayList();
    final List k = new ArrayList();

    public dwq(dwy dwyVar) {
        this.d = dwyVar;
    }

    public final void a(dwo dwoVar) {
        this.j.add(dwoVar);
        if (this.i) {
            dwoVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (!this.i) {
            this.i = true;
            this.f = i;
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((dwo) it.next()).f();
            }
        }
    }

    @Override // defpackage.dwo
    public final void f() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((dwq) it.next()).i) {
                return;
            }
        }
        this.c = true;
        dwo dwoVar = this.a;
        if (dwoVar != null) {
            dwoVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        dwq dwqVar = null;
        for (dwq dwqVar2 : this.k) {
            if (!(dwqVar2 instanceof dwr)) {
                i++;
                dwqVar = dwqVar2;
            }
        }
        if (dwqVar != null && i == 1 && dwqVar.i) {
            dwr dwrVar = this.h;
            if (dwrVar != null) {
                if (dwrVar.i) {
                    this.e = this.g * dwrVar.f;
                } else {
                    return;
                }
            }
            c(dwqVar.f + this.e);
        }
        dwo dwoVar2 = this.a;
        if (dwoVar2 != null) {
            dwoVar2.f();
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.d.as);
        sb.append(":");
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT;
                break;
            case 5:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT;
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append((Object) str);
        sb.append("(");
        if (this.i) {
            obj = Integer.valueOf(this.f);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.k.size());
        sb.append(":d=");
        sb.append(this.j.size());
        sb.append(">");
        return sb.toString();
    }
}
