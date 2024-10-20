package com.google.gson.internal.sql;

import defpackage.aonx;
import defpackage.aook;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aorn;
import defpackage.aoro;
import defpackage.aorp;
import defpackage.hht;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SqlDateTypeAdapter extends aoon {
    public static final aooo a = new aooo() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // defpackage.aooo
        public final aoon a(aonx aonxVar, aorn aornVar) {
            if (aornVar.a == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            aorpVar.j();
            return;
        }
        synchronized (this) {
            format = this.b.format((java.util.Date) date);
        }
        aorpVar.m(format);
    }

    @Override // defpackage.aoon
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Date a(aoro aoroVar) {
        Date date;
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        String j = aoroVar.j();
        synchronized (this) {
            TimeZone timeZone = this.b.getTimeZone();
            try {
                try {
                    date = new Date(this.b.parse(j).getTime());
                } catch (ParseException e) {
                    throw new aook(hht.j(j, aoroVar, "Failed parsing '", "' as SQL Date; at path "), e);
                }
            } finally {
                this.b.setTimeZone(timeZone);
            }
        }
        return date;
    }
}
