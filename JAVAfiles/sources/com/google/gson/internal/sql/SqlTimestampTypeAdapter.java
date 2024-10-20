package com.google.gson.internal.sql;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aorn;
import defpackage.aoro;
import defpackage.aorp;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SqlTimestampTypeAdapter extends aoon {
    public static final aooo a = new aooo() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // defpackage.aooo
        public final aoon a(aonx aonxVar, aorn aornVar) {
            if (aornVar.a == Timestamp.class) {
                return new SqlTimestampTypeAdapter(aonxVar.b(Date.class));
            }
            return null;
        }
    };
    private final aoon b;

    public SqlTimestampTypeAdapter(aoon aoonVar) {
        this.b = aoonVar;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        Date date = (Date) this.b.a(aoroVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        this.b.b(aorpVar, (Timestamp) obj);
    }
}
