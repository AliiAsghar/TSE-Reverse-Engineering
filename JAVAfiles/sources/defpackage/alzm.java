package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alzm extends alzn {
    private final alzl c;

    public alzm(alws alwsVar, int i, alzl alzlVar) {
        super(alwsVar, i);
        char c;
        this.c = alzlVar;
        StringBuilder sb = new StringBuilder("%");
        alwsVar.f(sb);
        if (true != alwsVar.d()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(alzlVar.G);
    }

    @Override // defpackage.alzn
    public final void a(alzr alzrVar, Object obj) {
        char c;
        alzl alzlVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            alzr.c(alzrVar.d, obj, "%t" + alzlVar.G);
            return;
        }
        alws alwsVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        alwsVar.f(sb);
        if (true != alwsVar.d()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(alzlVar.G);
        alzrVar.d.append(String.format(alwy.a, sb.toString(), obj));
    }
}
