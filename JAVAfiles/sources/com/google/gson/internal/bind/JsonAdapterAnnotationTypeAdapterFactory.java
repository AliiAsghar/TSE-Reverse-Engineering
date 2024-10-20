package com.google.gson.internal.bind;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import defpackage.aonx;
import defpackage.aooc;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aooq;
import defpackage.aooy;
import defpackage.aorn;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements aooo {
    public static final aooo a = new DummyTypeAdapterFactory();
    private static final aooo d = new DummyTypeAdapterFactory();
    public final aooy b;
    public final ConcurrentMap c = new ConcurrentHashMap();

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static class DummyTypeAdapterFactory implements aooo {
        @Override // defpackage.aooo
        public final aoon a(aonx aonxVar, aorn aornVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    public JsonAdapterAnnotationTypeAdapterFactory(aooy aooyVar) {
        this.b = aooyVar;
    }

    public static aooq d(Class cls) {
        return (aooq) cls.getAnnotation(aooq.class);
    }

    public static Object e(aooy aooyVar, Class cls) {
        return aooyVar.a(new aorn(cls)).a();
    }

    @Override // defpackage.aooo
    public final aoon a(aonx aonxVar, aorn aornVar) {
        aooq d2 = d(aornVar.a);
        if (d2 == null) {
            return null;
        }
        return b(this.b, aonxVar, aornVar, d2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aoon b(aooy aooyVar, aonx aonxVar, aorn aornVar, aooq aooqVar, boolean z) {
        ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1;
        aooc aoocVar;
        aooo aoooVar;
        aoon treeTypeAdapter;
        Object e = e(aooyVar, aooqVar.a());
        boolean z2 = e instanceof aoon;
        boolean b = aooqVar.b();
        if (z2) {
            treeTypeAdapter = (aoon) e;
        } else if (e instanceof aooo) {
            aooo aoooVar2 = (aooo) e;
            if (z) {
                aoooVar2 = c(aornVar.a, aoooVar2);
            }
            treeTypeAdapter = aoooVar2.a(aonxVar, aornVar);
        } else {
            if (!(e instanceof ConversationSuggestionResponseSerializer.AnonymousClass1)) {
                if (e instanceof aooc) {
                    anonymousClass1 = null;
                } else {
                    throw new IllegalArgumentException("Invalid attempt to bind an instance of " + e.getClass().getName() + " as a @JsonAdapter for " + aornVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                }
            } else {
                anonymousClass1 = (ConversationSuggestionResponseSerializer.AnonymousClass1) e;
            }
            if (e instanceof aooc) {
                aoocVar = (aooc) e;
            } else {
                aoocVar = null;
            }
            if (z) {
                aoooVar = a;
            } else {
                aoooVar = d;
            }
            treeTypeAdapter = new TreeTypeAdapter(anonymousClass1, aoocVar, aonxVar, aornVar, aoooVar, b);
            b = false;
        }
        if (treeTypeAdapter != null && b) {
            return treeTypeAdapter.d();
        }
        return treeTypeAdapter;
    }

    public final aooo c(Class cls, aooo aoooVar) {
        aooo aoooVar2 = (aooo) this.c.putIfAbsent(cls, aoooVar);
        if (aoooVar2 != null) {
            return aoooVar2;
        }
        return aoooVar;
    }
}
