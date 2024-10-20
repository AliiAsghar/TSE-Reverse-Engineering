package com.google.gson.internal.bind;

import defpackage.aonx;
import defpackage.aook;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aopa;
import defpackage.aorh;
import defpackage.aorn;
import defpackage.aoro;
import defpackage.aorp;
import defpackage.hht;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class DefaultDateTypeAdapter extends aoon {
    public static final aooo a = new aooo() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // defpackage.aooo
        public final aoon a(aonx aonxVar, aorn aornVar) {
            if (aornVar.a == Date.class) {
                return new DefaultDateTypeAdapter();
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };
    private final List b;

    public DefaultDateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (aopa.a()) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US));
        }
    }

    private final Date c(aoro aoroVar) {
        List list = this.b;
        String j = aoroVar.j();
        synchronized (list) {
            for (DateFormat dateFormat : this.b) {
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    Date parse = dateFormat.parse(j);
                    dateFormat.setTimeZone(timeZone);
                    return parse;
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
            try {
                return aorh.a(j, new ParsePosition(0));
            } catch (ParseException e) {
                throw new aook(hht.j(j, aoroVar, "Failed parsing '", "' as Date; at path "), e);
            }
        }
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        return c(aoroVar);
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            aorpVar.j();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        aorpVar.m(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ")";
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ")";
    }
}
