package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class agpr {
    public final ContentValues a;
    protected final Map b;
    protected final String c;
    public final agpu d;
    public alog e;
    protected final Map f;

    public agpr(String str, ContentValues contentValues, Map map, alog alogVar, agpu agpuVar) {
        HashMap hashMap;
        this.c = str;
        this.a = new ContentValues(contentValues);
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(map);
        }
        this.b = hashMap;
        this.e = alogVar;
        this.d = agpuVar;
        this.f = ((agpq) akec.w(agnc.b, agpq.class)).Ld();
    }

    private final agnw a() {
        return agnc.d(this.d.e);
    }

    private final boolean c() {
        Map map = this.b;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final String o(List list, String str, Object obj, String str2) {
        String str3;
        if (obj != null) {
            if (obj instanceof Boolean) {
                if (true != ((Boolean) obj).booleanValue()) {
                    str3 = "0";
                } else {
                    str3 = "1";
                }
                list.add(str3);
            } else {
                if (obj instanceof agpj) {
                    return "(" + str + " IS " + ((agpj) obj).ad(agpo.b()) + ")";
                }
                list.add(obj.toString());
            }
            return a.bZ(str2, str, "(", " IS ", ")");
        }
        return a.bW(str, "(", " IS NULL)");
    }

    public alog b() {
        agnw d;
        d = agnc.d("$primary");
        return (alog) d.s("conversations.updateAndReturnUpdatedRows-txn", new ndb(this, 0, 18, null));
    }

    public final int e() {
        return p(a());
    }

    public final agpj f() {
        ArrayList arrayList = new ArrayList();
        return new agpk(i(arrayList, "$V"), arrayList.toArray(new Object[0]));
    }

    public final akul g() {
        Object obj;
        agnw a = a();
        akul o = a.o();
        abdo abdoVar = new abdo(this, a, 11, null);
        obj = agnc.c.j.get();
        return o.h(abdoVar, (Executor) obj);
    }

    protected final String h(agpo agpoVar, List list) {
        if (!this.d.a && this.f.containsKey(this.c)) {
            alob alobVar = new alob();
            alobVar.j(this.e);
            alobVar.h(uzz.e());
            this.e = alobVar.g();
        }
        if (this.e.isEmpty()) {
            return "1";
        }
        return new algs(" AND ").d(alzz.as(this.e, new abdo(agpoVar, list, 10)));
    }

    protected final String i(List list, String str) {
        StringBuilder sb = new StringBuilder();
        Stream map = Collection.EL.stream(this.a.keySet()).sorted().filter(new agol(this.d.f, 3)).map(new uoc((Object) this, (java.util.Collection) list, str, 5));
        Map map2 = this.b;
        if (map2 != null) {
            map = Stream.CC.concat(map, Collection.EL.stream(map2.entrySet()).sorted(new zyv(6)).map(new agpp(list, str, 0)));
        }
        sb.append((String) map.collect(Collectors.joining(" AND ")));
        return a.bW(sb.toString(), "(NOT (", "))");
    }

    public final String j(agpo agpoVar) {
        return agnc.h(this.a, this.b, agpoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(agpv agpvVar) {
        alog alogVar = this.e;
        int i = ((alsx) alogVar).c;
        int i2 = 0;
        while (i2 < i) {
            boolean d = ((agpw) alogVar.get(i2)).d(agpvVar);
            i2++;
            if (d) {
                return;
            }
        }
    }

    public final boolean l(String str) {
        return this.a.containsKey(str);
    }

    public final boolean m() {
        if (this.a.size() == 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final String[] n() {
        return (String[]) this.a.keySet().toArray(new String[0]);
    }

    public final int p(agnw agnwVar) {
        return q(agnwVar, agpo.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int q(agnw agnwVar, agpo agpoVar) {
        int c;
        boolean z;
        boolean c2 = c();
        if (c2 || this.a.size() != 0) {
            ArrayList arrayList = new ArrayList();
            String h = h(agpoVar, arrayList);
            agpu agpuVar = this.d;
            if (agpuVar.b) {
                if (Collection.EL.stream(this.a.keySet()).allMatch(new agol(agpuVar.f, 2)) && !c()) {
                    h = null;
                } else {
                    h = h + " AND " + i(arrayList, "?");
                }
            }
            if (h != null) {
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                String str = this.c;
                adwp u = aglo.u();
                Integer a = agnb.a(str);
                if (a != null) {
                    ArrayList arrayList2 = new ArrayList();
                    String h2 = h(agpo.b(), arrayList2);
                    StringBuilder sb = new StringBuilder("UPDATE ");
                    sb.append(this.c);
                    sb.append(" SET ");
                    sb.append(j(null));
                    sb.append(" WHERE ");
                    sb.append(h2);
                    sb.append("\nARGS:\n");
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        sb.append((String) arrayList2.get(i));
                        sb.append(";");
                    }
                    Log.i("D26R", a.cg(sb.toString(), str, "UPDATE ", " "));
                    adwp.l(a.intValue());
                }
                aoij q = u.q(agnwVar, new rhq(str, this, 12, null), new agon(this));
                if (!c2) {
                    String str2 = this.c;
                    ContentValues contentValues = this.a;
                    agpt agptVar = new agpt(this.d);
                    agptVar.g();
                    c = agnwVar.e(str2, contentValues, h, strArr, agptVar.a());
                } else {
                    agpu agpuVar2 = this.d;
                    akrh e = aktp.e("UpdateBase#performUpdateWithSqlExpressions update");
                    try {
                        SQLiteStatement compileStatement = agnwVar.j().compileStatement("UPDATE " + this.c + " SET " + j(agpoVar) + " WHERE " + h);
                        compileStatement.bindAllArgsAsStrings(strArr);
                        c = agnwVar.c(compileStatement, agpuVar2.d);
                        e.close();
                    } finally {
                    }
                }
                if (c > 0) {
                    z = true;
                } else {
                    z = false;
                }
                q.a(z);
                return c;
            }
        }
        return 0;
    }

    public final void r() {
        p(a());
    }
}
