package defpackage;

import android.content.Context;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uoo {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueDebugger");
    public final Context b;
    public final anen c;
    public final uot d;
    public final aksr e;
    public final armf f;
    public final apwt g;

    public uoo(Context context, anen anenVar, uot uotVar, aksr aksrVar, armf armfVar, apwt apwtVar) {
        this.b = context;
        this.c = anenVar;
        this.d = uotVar;
        this.e = aksrVar;
        this.f = armfVar;
        this.g = apwtVar;
    }

    public final void a(final arjs arjsVar, final EnumSet enumSet, final boolean z, final Pattern pattern, final Pattern pattern2) {
        aktp.ai(new Callable() { // from class: uok
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long j;
                ucz h;
                boolean z2;
                alnm alnmVar;
                Throwable th;
                ucz uczVar;
                Pattern pattern3;
                ucz h2;
                upr uprVar;
                Locale locale;
                Locale locale2;
                Pattern pattern4;
                Iterator it;
                String valueOf;
                String valueOf2;
                String str;
                Pattern pattern5;
                boolean z3;
                uot uotVar;
                arjs arjsVar2;
                alnm alnmVar2;
                uos uosVar;
                String format;
                Object apply;
                EnumSet enumSet2 = enumSet;
                boolean contains = enumSet2.contains(uny.DUMP_DB);
                arjs arjsVar3 = arjsVar;
                Pattern pattern6 = pattern;
                int i = 0;
                if (contains) {
                    uny.DUMP_DB.toString();
                    arjsVar3.g("PWQ database dump:");
                    upy a2 = uqb.a();
                    a2.w("WorkQueueDebugger#dumpDatabase1");
                    a2.n(new agpl("COUNT(*)"), "count");
                    apply = new unt(2).apply(uqb.c);
                    a2.c((upu[]) apply);
                    a2.t(uqb.c.f);
                    upv upvVar = (upv) a2.b().n();
                    try {
                        h2 = arjsVar3.h();
                        while (upvVar.moveToNext()) {
                            try {
                                if (pattern6 == null || pattern6.matcher(upvVar.k()).matches()) {
                                    arjsVar3.g(upvVar.j() + " ==> " + upvVar.cX("count"));
                                    ucz h3 = arjsVar3.h();
                                    try {
                                        HashSet hashSet = new HashSet();
                                        HashSet hashSet2 = new HashSet();
                                        upy a3 = uqb.a();
                                        a3.w("WorkQueueDebugger#dumpDatabase2");
                                        a3.d(new uol(upvVar, i));
                                        upv upvVar2 = (upv) a3.b().n();
                                        while (true) {
                                            try {
                                                upr uprVar2 = (upr) upvVar2.cM();
                                                if (uprVar2 == null) {
                                                    break;
                                                }
                                                String str2 = uprVar2.k() + "; " + uprVar2.p() + "; " + uprVar2.o();
                                                String n = uprVar2.n();
                                                if (n != null) {
                                                    str2 = a.co(n, str2, "; ");
                                                }
                                                Date q = uprVar2.q();
                                                if (q.getTime() != 0) {
                                                    str2 = str2 + "; " + String.valueOf(q);
                                                }
                                                if (hashSet.contains(n)) {
                                                    str2 = str2.concat(" DEDUPE ERROR");
                                                }
                                                if (hashSet2.contains(Integer.valueOf(Arrays.hashCode(uprVar2.s())))) {
                                                    str2 = str2.concat(" PROTO DUPE");
                                                }
                                                arjsVar3.g(str2);
                                                String n2 = uprVar2.n();
                                                if (n2 != null) {
                                                    hashSet.add(n2);
                                                }
                                                hashSet2.add(Integer.valueOf(Arrays.hashCode(uprVar2.s())));
                                            } catch (Throwable th2) {
                                                try {
                                                    upvVar2.close();
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        upvVar2.close();
                                        h3.close();
                                        i = 0;
                                    } finally {
                                    }
                                }
                            } finally {
                                try {
                                    h2.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                }
                            }
                        }
                        j = 0;
                        h2.close();
                        upvVar.close();
                    } finally {
                    }
                } else {
                    j = 0;
                }
                uoo uooVar = uoo.this;
                if (enumSet2.contains(uny.DUMP_EXECUTION)) {
                    uny.DUMP_EXECUTION.toString();
                    ((uro) uooVar.g.b()).b(arjsVar3, pattern6);
                }
                if (enumSet2.contains(uny.DUMP_HISTORY)) {
                    uny.DUMP_HISTORY.toString();
                    uot uotVar2 = uooVar.d;
                    synchronized (uotVar2.d) {
                        arjsVar3.g("PWQ Recent History: (raw number " + uotVar2.e.size() + ")");
                        try {
                            h = arjsVar3.h();
                            z2 = z;
                            if (z2) {
                                try {
                                    alnmVar = new alnm();
                                } catch (Throwable th5) {
                                    th = th5;
                                    uczVar = h;
                                    try {
                                        uczVar.close();
                                        throw th;
                                    } catch (Throwable th6) {
                                        th.addSuppressed(th6);
                                        throw th;
                                    }
                                }
                            } else {
                                alnmVar = null;
                            }
                            pattern3 = pattern2;
                            if (z2) {
                                Iterator it2 = uotVar2.e.iterator();
                                int i2 = -1;
                                while (it2.hasNext()) {
                                    uos uosVar2 = (uos) it2.next();
                                    i2++;
                                    if (uosVar2.a(pattern6, pattern3)) {
                                        Map.EL.putIfAbsent(alnmVar, Long.valueOf(uot.a(uosVar2.c)), Integer.valueOf(i2));
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            arjsVar3.g(hht.c(th7, "caught exception in dumpStateForDebugging "));
                        }
                        try {
                            Iterator it3 = uotVar2.e.iterator();
                            while (it3.hasNext()) {
                                uos uosVar3 = (uos) it3.next();
                                if (uosVar3.a(pattern6, pattern3)) {
                                    Object obj = uosVar3.b;
                                    if (obj instanceof upr) {
                                        try {
                                            uprVar = (upr) obj;
                                            locale = Locale.US;
                                            locale2 = Locale.US;
                                            pattern4 = pattern3;
                                            it = it3;
                                            valueOf = String.valueOf(uprVar.a);
                                            valueOf2 = String.valueOf(uprVar.b);
                                            byte[] bArr = uprVar.c;
                                            if (bArr != null) {
                                                str = String.valueOf(bArr.length);
                                            } else {
                                                str = "NULL";
                                            }
                                            pattern5 = pattern6;
                                            uczVar = h;
                                            z3 = z2;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            uczVar = h;
                                            th = th;
                                            uczVar.close();
                                            throw th;
                                        }
                                        try {
                                            uotVar = uotVar2;
                                            arjsVar2 = arjsVar3;
                                            try {
                                                alnmVar2 = alnmVar;
                                                uosVar = uosVar3;
                                                format = String.format(locale, "%s", String.format(locale2, "WorkQueueTable [_id: %s, type: %s, rawdata: %s, attempts: %s, timestamp: %s, queue: %s, deduplication_tag: %s, scheduled_in_workmanager: %s, workmanager_id: %s, minimum_start_time: %s, cancellation_tag: %s]", valueOf, valueOf2, "BLOB".concat(String.valueOf(str)), String.valueOf(uprVar.d), String.valueOf(uprVar.e), String.valueOf(uprVar.f), String.valueOf(uprVar.g), String.valueOf(uprVar.h), String.valueOf(uprVar.i), String.valueOf(uprVar.j), String.valueOf(uprVar.k)));
                                            } catch (Throwable th9) {
                                                th = th9;
                                                arjsVar3 = arjsVar2;
                                                uczVar.close();
                                                throw th;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            th = th;
                                            uczVar.close();
                                            throw th;
                                        }
                                    } else {
                                        uotVar = uotVar2;
                                        arjsVar2 = arjsVar3;
                                        pattern5 = pattern6;
                                        uczVar = h;
                                        z3 = z2;
                                        alnmVar2 = alnmVar;
                                        pattern4 = pattern3;
                                        it = it3;
                                        uosVar = uosVar3;
                                        try {
                                            format = obj.toString();
                                        } catch (Throwable th11) {
                                            th = th11;
                                            arjsVar3 = arjsVar2;
                                            th = th;
                                            uczVar.close();
                                            throw th;
                                        }
                                    }
                                    uos uosVar4 = uosVar;
                                    String format2 = String.format(Locale.US, "tid: %05d +%s %s: %s", Long.valueOf(uosVar4.d), String.format(Locale.US, "%13d", Long.valueOf(uosVar4.a - j)), uot.b(uosVar4.e), format);
                                    if (alnmVar2 != null) {
                                        alnmVar = alnmVar2;
                                        format2 = format2 + " [stack: " + String.valueOf(alnmVar.get(Long.valueOf(uot.a(uosVar4.c)))) + "]";
                                    } else {
                                        alnmVar = alnmVar2;
                                    }
                                    arjsVar3 = arjsVar2;
                                    try {
                                        arjsVar3.g(format2);
                                        j = uosVar4.a;
                                        pattern3 = pattern4;
                                        it3 = it;
                                        pattern6 = pattern5;
                                        h = uczVar;
                                        z2 = z3;
                                        uotVar2 = uotVar;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        th = th;
                                        uczVar.close();
                                        throw th;
                                    }
                                }
                            }
                            uot uotVar3 = uotVar2;
                            uczVar = h;
                            if (z2) {
                                arjsVar3.g(a.cb(alnmVar.c, "Stack Dictionary: (count ", ")"));
                                alnk alnkVar = new alnk((alnl) alnmVar.a().entrySet());
                                while (alnkVar.hasNext()) {
                                    Map.Entry entry = (Map.Entry) alnkVar.next();
                                    arjsVar3.g("stack code " + String.valueOf(entry.getKey()));
                                    uot uotVar4 = uotVar3;
                                    ArrayList arrayList = new ArrayList(uotVar4.e);
                                    h2 = arjsVar3.h();
                                    try {
                                        for (StackTraceElement stackTraceElement : ((uos) arrayList.get(((Integer) entry.getKey()).intValue())).c) {
                                            arjsVar3.g(stackTraceElement.toString());
                                        }
                                        h2.close();
                                        uotVar3 = uotVar4;
                                    } catch (Throwable th13) {
                                    }
                                }
                            }
                            uczVar.close();
                        } catch (Throwable th14) {
                            th = th14;
                        }
                    }
                    return null;
                }
                return null;
            }
        }, this.c).i(new mmc(this, enumSet, arjsVar, pattern, 16), this.c).h(new uhw(9), andi.a);
    }
}
