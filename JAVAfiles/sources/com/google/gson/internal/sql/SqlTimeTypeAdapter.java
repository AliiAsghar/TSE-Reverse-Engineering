package com.google.gson.internal.sql;

import defpackage.aonx;
import defpackage.aook;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aorn;
import defpackage.aoro;
import defpackage.aorp;
import defpackage.hht;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SqlTimeTypeAdapter extends aoon {
    public static final aooo a = new aooo() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // defpackage.aooo
        public final aoon a(aonx aonxVar, aorn aornVar) {
            if (aornVar.a == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            aorpVar.j();
            return;
        }
        synchronized (this) {
            format = this.b.format((Date) time);
        }
        aorpVar.m(format);
    }

    @Override // defpackage.aoon
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Time a(aoro aoroVar) {
        Time time;
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        String j = aoroVar.j();
        synchronized (this) {
            TimeZone timeZone = this.b.getTimeZone();
            try {
                try {
                    time = new Time(this.b.parse(j).getTime());
                } catch (ParseException e) {
                    throw new aook(hht.j(j, aoroVar, "Failed parsing '", "' as SQL Time; at path "), e);
                }
            } finally {
                this.b.setTimeZone(timeZone);
            }
        }
        return time;
    }
}
