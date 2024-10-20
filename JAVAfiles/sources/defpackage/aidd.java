package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aidd {
    public static final alvi a = alvi.m("com/google/android/libraries/privatetelemetry/mobalt/db/DataService");
    public static final Duration b = Duration.ofDays(2);
    public final ahmn c;

    public aidd(ahmn ahmnVar) {
        this.c = ahmnVar;
    }

    public static final int d(agrk agrkVar, aidn aidnVar, int i, int i2) {
        agrk agrkVar2 = new agrk((short[]) null);
        agrkVar2.x("SELECT last_sent_day_index FROM Reports");
        agrkVar2.x(" WHERE ");
        agrkVar2.x("customer_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.a));
        agrkVar2.x(" AND project_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.b));
        agrkVar2.x(" AND metric_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.c));
        agrkVar2.x(" AND report_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.d));
        Cursor H = agrkVar.H(agrkVar2.J());
        try {
            int i3 = i + 1;
            if (H.moveToFirst()) {
                if (!H.isNull(H.getColumnIndexOrThrow("last_sent_day_index"))) {
                    i3 = H.getInt(H.getColumnIndexOrThrow("last_sent_day_index")) + 1;
                }
            } else {
                agrkVar.w("Reports", aiep.g(aidnVar, i), 4);
            }
            if (H != null) {
                H.close();
            }
            int i4 = i - 3;
            if (i3 < i4) {
                i3 = i4;
            }
            if (i3 < i2) {
                return i2;
            }
            return i3;
        } catch (Throwable th) {
            if (H != null) {
                try {
                    H.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final void e(agrk agrkVar, aidn aidnVar, int i, alex alexVar, int i2, aidj aidjVar, long j, Object obj, BiFunction biFunction) {
        boolean z;
        Object apply;
        Object apply2;
        Object apply3;
        String str;
        Object apply4;
        Object apply5;
        long c = ambf.a.b(alexVar.toByteArray()).c();
        ContentValues contentValues = new ContentValues();
        Long valueOf = Long.valueOf(c);
        contentValues.put("system_profile_hash", valueOf);
        contentValues.put("system_profile", alexVar.toByteArray());
        agrkVar.w("SystemProfiles", contentValues, 4);
        agrkVar.w("Reports", aiep.g(aidnVar, i - 1), 4);
        if (i2 != 4 && i2 != 3 && i2 != 5) {
            z = false;
        } else {
            z = true;
        }
        d.t(z, "System profile selection must be one of SELECT_FIRST, SELECT_LAST, OR REPORT_ALL");
        agrk agrkVar2 = new agrk((short[]) null);
        agrkVar2.x("SELECT system_profile_hash, aggregate_value");
        agrkVar2.x(" FROM AggregateStore");
        agrkVar2.x(" WHERE customer_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.a));
        agrkVar2.x(" AND project_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.b));
        agrkVar2.x(" AND metric_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.c));
        agrkVar2.x(" AND report_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.d));
        agrkVar2.x(" AND day_index = ?");
        agrkVar2.y(Long.valueOf(i));
        agrkVar2.x(" AND event_vector = ?");
        agrkVar2.z(aidjVar.b());
        agrkVar2.x(" ORDER BY system_profile_hash == ? DESC");
        agrkVar2.y(valueOf);
        agrkVar2.x(", system_profile_hash ASC");
        agrkVar2.x(" LIMIT 1");
        Cursor H = agrkVar.H(agrkVar2.J());
        try {
            if (!H.moveToFirst()) {
                apply5 = biFunction.apply(obj, Optional.empty());
                i(agrkVar, aidnVar, i, c, aidjVar, j, (Optional) apply5);
            } else {
                long j2 = H.getLong(H.getColumnIndexOrThrow("system_profile_hash"));
                if (j2 == c) {
                    Optional empty = Optional.empty();
                    apply4 = biFunction.apply(obj, Optional.of(g(H)));
                    j(agrkVar, aidnVar, i, j2, empty, aidjVar, j, (Optional) apply4);
                } else {
                    int i3 = i2 - 2;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                apply3 = biFunction.apply(obj, Optional.empty());
                                i(agrkVar, aidnVar, i, c, aidjVar, j, (Optional) apply3);
                            } else {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 != 4) {
                                            if (i2 != 5) {
                                                str = "UNRECOGNIZED";
                                            } else {
                                                str = "REPORT_ALL";
                                            }
                                        } else {
                                            str = "SELECT_FIRST";
                                        }
                                    } else {
                                        str = "SELECT_LAST";
                                    }
                                } else {
                                    str = "SYSTEM_PROFILE_SELECTION_POLICY_UNSET";
                                }
                                throw new AssertionError(a.cp(str, "Unsupported system profile selection policy: "));
                            }
                        } else {
                            Optional empty2 = Optional.empty();
                            apply2 = biFunction.apply(obj, Optional.of(g(H)));
                            j(agrkVar, aidnVar, i, j2, empty2, aidjVar, j, (Optional) apply2);
                        }
                    } else {
                        Optional of = Optional.of(valueOf);
                        apply = biFunction.apply(obj, Optional.of(g(H)));
                        j(agrkVar, aidnVar, i, j2, of, aidjVar, j, (Optional) apply);
                    }
                }
            }
            if (H != null) {
                H.close();
            }
        } finally {
        }
    }

    public static final alog f(agrk agrkVar, int i, agrk agrkVar2) {
        aidj aidjVar;
        HashMap hashMap = new HashMap();
        Cursor H = agrkVar.H(agrkVar2);
        while (H.moveToNext()) {
            try {
                OptionalInt empty = OptionalInt.empty();
                OptionalInt empty2 = OptionalInt.empty();
                Optional empty3 = Optional.empty();
                String string = H.getString(H.getColumnIndexOrThrow("event_vector"));
                if (string.isEmpty()) {
                    int i2 = alog.d;
                    aidjVar = new aidj(alsx.a);
                } else {
                    Stream map = DesugarArrays.stream(string.split(",")).map(new agnz(14));
                    int i3 = alog.d;
                    aidjVar = new aidj((alog) map.collect(alls.a));
                }
                long j = H.getLong(H.getColumnIndexOrThrow("system_profile_hash"));
                alex alexVar = (alex) apag.parseFrom(alex.a, H.getBlob(H.getColumnIndexOrThrow("system_profile")), aozs.a());
                if (alexVar != null) {
                    int columnIndex = H.getColumnIndex("min_day_index");
                    if (columnIndex != -1 && (empty = OptionalInt.of(H.getInt(columnIndex))) == null) {
                        throw new NullPointerException("Null minDayIndex");
                    }
                    OptionalInt optionalInt = empty;
                    int columnIndex2 = H.getColumnIndex("max_day_index");
                    if (columnIndex2 != -1 && (empty2 = OptionalInt.of(H.getInt(columnIndex2))) == null) {
                        throw new NullPointerException("Null maxDayIndex");
                    }
                    OptionalInt optionalInt2 = empty2;
                    int columnIndex3 = H.getColumnIndex("aggregate_value");
                    if (columnIndex3 != -1) {
                        empty3 = Optional.of((aieg) apag.parseFrom(aieg.a, H.getBlob(columnIndex3), aozs.a()));
                    }
                    aicv aicvVar = new aicv(aidjVar, j, alexVar, optionalInt, optionalInt2, empty3);
                    List list = (List) hashMap.get(aicvVar.a);
                    if (list == null) {
                        hashMap.put(aicvVar.a, alzz.ap(aicvVar));
                    } else {
                        int i4 = i - 2;
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    list.add(aicvVar);
                                } else {
                                    throw new IllegalStateException(a.bV(a.ak(i), "Unexpected value for system_profile_selection: "));
                                }
                            } else if (((aicv) list.get(0)).d.orElseThrow() > aicvVar.d.orElseThrow()) {
                                hashMap.put(aicvVar.a, alzz.ap(aicvVar));
                            }
                        } else if (((aicv) list.get(0)).e.orElseThrow() < aicvVar.e.orElseThrow()) {
                            hashMap.put(aicvVar.a, alzz.ap(aicvVar));
                        }
                    }
                } else {
                    throw new NullPointerException("Null systemProfile");
                }
            } catch (Throwable th) {
                if (H != null) {
                    try {
                        H.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (H != null) {
            H.close();
        }
        Stream flatMap = Collection.EL.stream(hashMap.values()).flatMap(new agnz(10));
        int i5 = alog.d;
        Iterable iterable = (Iterable) flatMap.collect(alls.a);
        ahnx ahnxVar = new ahnx(9);
        aloh alohVar = new aloh();
        for (Object obj : iterable) {
            obj.getClass();
            alohVar.b(ahnxVar.apply(obj), obj);
        }
        return (alog) Collection.EL.stream(alohVar.a().map.values()).map(new agnz(11)).collect(alls.a);
    }

    private static agxw g(Cursor cursor) {
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("aggregate_value"));
        if (blob == null) {
            return agxw.j();
        }
        return new agxw(Optional.of((aieg) apag.parseFrom(aieg.a, blob, aozs.a())));
    }

    private static final boolean h(agrk agrkVar, aidn aidnVar, int i, long j, aidj aidjVar, long j2) {
        boolean z = true;
        if (j2 == 0) {
            return true;
        }
        agrk agrkVar2 = new agrk((short[]) null);
        agrkVar2.x("SELECT COUNT(DISTINCT event_vector) AS num_event_vectors");
        agrkVar2.x(" FROM AggregateStore");
        agrkVar2.x(" WHERE customer_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.a));
        agrkVar2.x(" AND project_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.b));
        agrkVar2.x(" AND metric_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.c));
        agrkVar2.x(" AND report_id = ?");
        agrkVar2.y(Long.valueOf(aidnVar.d));
        agrkVar2.x(" AND day_index = ?");
        agrkVar2.y(Long.valueOf(i));
        agrkVar2.x(" AND system_profile_hash = ?");
        agrkVar2.y(Long.valueOf(j));
        Cursor H = agrkVar.H(agrkVar2.J());
        try {
            H.moveToFirst();
            if (H.getLong(H.getColumnIndexOrThrow("num_event_vectors")) >= j2) {
                ((alvg) ((alvg) a.i()).h("com/google/android/libraries/privatetelemetry/mobalt/db/DataService", "canAddEventVectorToSystemProfile", 234, "DataService.java")).J("Dropping eventVector %s for report %s, due to exceeding event_vector_buffer_max %s", aidjVar, aidnVar, Long.valueOf(j2));
                z = false;
            }
            if (H != null) {
                H.close();
            }
            return z;
        } catch (Throwable th) {
            if (H != null) {
                try {
                    H.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static final void i(agrk agrkVar, aidn aidnVar, int i, long j, aidj aidjVar, long j2, Optional optional) {
        if (!optional.isEmpty() && h(agrkVar, aidnVar, i, j, aidjVar, j2)) {
            agxw agxwVar = (agxw) optional.get();
            if (agxwVar.h()) {
                agrkVar.w("AggregateStore", ahxe.d(aidnVar, i, j, aidjVar, Optional.empty()), 1);
            } else {
                agrkVar.w("AggregateStore", ahxe.d(aidnVar, i, j, aidjVar, Optional.of(agxwVar.g())), 1);
            }
        }
    }

    private static final void j(agrk agrkVar, aidn aidnVar, int i, long j, Optional optional, aidj aidjVar, long j2, Optional optional2) {
        if (!optional.isEmpty() || !optional2.isEmpty()) {
            boolean z = true;
            if (!optional.isEmpty()) {
                if (((Long) optional.get()).equals(Long.valueOf(j))) {
                    z = false;
                }
            }
            d.t(z, "New system profile has must differ from the existing system profile");
            if (!optional.isPresent() || h(agrkVar, aidnVar, i, ((Long) optional.get()).longValue(), aidjVar, j2)) {
                if (optional.isPresent() && optional2.isPresent()) {
                    agxw agxwVar = (agxw) optional2.get();
                    if (agxwVar.h()) {
                        agrkVar.I(ahxe.f(aidnVar, i, aidjVar, j, ((Long) optional.get()).longValue()));
                        return;
                    }
                    Long l = (Long) optional.get();
                    l.longValue();
                    aieg g = agxwVar.g();
                    agrk agrkVar2 = new agrk((short[]) null);
                    agrkVar2.x("UPDATE AggregateStore SET system_profile_hash = ? ");
                    agrkVar2.y(l);
                    agrkVar2.x(", aggregate_value = ? ");
                    agrkVar2.A(g.toByteArray());
                    agrkVar2.x(" WHERE customer_id = ?");
                    agrkVar2.y(Long.valueOf(aidnVar.a));
                    agrkVar2.x(" AND project_id = ?");
                    agrkVar2.y(Long.valueOf(aidnVar.b));
                    agrkVar2.x(" AND metric_id = ?");
                    agrkVar2.y(Long.valueOf(aidnVar.c));
                    agrkVar2.x(" AND report_id = ?");
                    agrkVar2.y(Long.valueOf(aidnVar.d));
                    agrkVar2.x(" AND day_index = ?");
                    agrkVar2.y(Long.valueOf(i));
                    agrkVar2.x(" AND event_vector = ?");
                    agrkVar2.z(aidjVar.b());
                    agrkVar2.x(" AND system_profile_hash = ?");
                    agrkVar2.y(Long.valueOf(j));
                    agrkVar.I(agrkVar2.J());
                    return;
                }
                if (optional.isPresent()) {
                    agrkVar.I(ahxe.f(aidnVar, i, aidjVar, j, ((Long) optional.get()).longValue()));
                    return;
                }
                if (optional2.isPresent()) {
                    agxw agxwVar2 = (agxw) optional2.get();
                    if (!agxwVar2.h()) {
                        aieg g2 = agxwVar2.g();
                        agrk agrkVar3 = new agrk((short[]) null);
                        agrkVar3.x("UPDATE AggregateStore SET aggregate_value = ? ");
                        agrkVar3.A(g2.toByteArray());
                        agrkVar3.x(" WHERE customer_id = ?");
                        agrkVar3.y(Long.valueOf(aidnVar.a));
                        agrkVar3.x(" AND project_id = ?");
                        agrkVar3.y(Long.valueOf(aidnVar.b));
                        agrkVar3.x(" AND metric_id = ?");
                        agrkVar3.y(Long.valueOf(aidnVar.c));
                        agrkVar3.x(" AND report_id = ?");
                        agrkVar3.y(Long.valueOf(aidnVar.d));
                        agrkVar3.x(" AND day_index = ?");
                        agrkVar3.y(Long.valueOf(i));
                        agrkVar3.x(" AND event_vector = ?");
                        agrkVar3.z(aidjVar.b());
                        agrkVar3.x(" AND system_profile_hash = ?");
                        agrkVar3.y(Long.valueOf(j));
                        agrkVar.I(agrkVar3.J());
                        return;
                    }
                    throw new AssertionError("Empty system profile and NULL value while updating value for ".concat(aidnVar.toString()));
                }
            }
        }
    }

    public final akul a(Instant instant) {
        return akul.g(this.c.f(new aidc(instant, 1)));
    }

    public final akul b(Instant instant) {
        return akul.g(this.c.e(new aiwz(instant, 1)));
    }

    public final akul c() {
        return akul.g(this.c.e(new aixs() { // from class: aida
            @Override // defpackage.aixs
            public final Object a(agrk agrkVar) {
                alob alobVar = new alob();
                agrk agrkVar2 = new agrk((short[]) null);
                agrkVar2.x("SELECT observation_store_id, observation_batch FROM ObservationStore ORDER BY observation_store_id");
                Cursor H = agrkVar.H(agrkVar2.J());
                int i = 0;
                while (H.moveToNext()) {
                    try {
                        long j = H.getLong(H.getColumnIndexOrThrow("observation_store_id"));
                        byte[] blob = H.getBlob(H.getColumnIndexOrThrow("observation_batch"));
                        if (i > 0 && blob.length + i > 100000) {
                            break;
                        }
                        alobVar.h(new aidm(j, (aiei) apag.parseFrom(aiei.a, blob, aozs.a())));
                        i += blob.length;
                    } catch (Throwable th) {
                        if (H != null) {
                            try {
                                H.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (H != null) {
                    H.close();
                }
                return alobVar.g();
            }
        }));
    }
}
