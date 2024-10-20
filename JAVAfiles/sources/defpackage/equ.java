package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class equ {
    public String a;
    public Uri b;
    public eqz c;
    public vtk d;
    private String e;
    private eqx f;
    private List g;
    private alog h;
    private long i;
    private erh j;
    private final erc k;

    public equ() {
        this.d = new vtk((byte[]) null);
        this.f = new eqx();
        this.g = Collections.emptyList();
        int i = alog.d;
        this.h = alsx.a;
        this.c = new eqz();
        this.k = erc.a;
        this.i = -9223372036854775807L;
    }

    public final ere a() {
        erb erbVar;
        Uri uri = this.f.b;
        dzg.d(true);
        Uri uri2 = this.b;
        eqy eqyVar = null;
        if (uri2 != null) {
            String str = this.e;
            eqx eqxVar = this.f;
            if (eqxVar.a != null) {
                eqyVar = new eqy(eqxVar);
            }
            erbVar = new erb(uri2, str, eqyVar, this.g, this.h, this.i);
        } else {
            erbVar = null;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        eqw eqwVar = new eqw(this.d);
        era eraVar = new era(this.c);
        erh erhVar = this.j;
        if (erhVar == null) {
            erhVar = erh.a;
        }
        return new ere(str3, eqwVar, erbVar, eraVar, erhVar, this.k);
    }

    public equ(ere ereVar) {
        this();
        this.d = new vtk(ereVar.e);
        this.a = ereVar.a;
        this.j = ereVar.d;
        this.c = new eqz(ereVar.c);
        this.k = ereVar.f;
        erb erbVar = ereVar.b;
        if (erbVar != null) {
            this.e = erbVar.b;
            this.b = erbVar.a;
            this.g = erbVar.e;
            this.h = erbVar.g;
            eqy eqyVar = erbVar.c;
            this.f = eqyVar != null ? new eqx(eqyVar) : new eqx();
            this.i = erbVar.i;
        }
    }
}
