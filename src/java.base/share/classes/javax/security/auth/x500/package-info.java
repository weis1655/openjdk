/*
 * Copyright (c) 2000, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/**
 * This package contains the classes that should be used to store
 * X500 Principal and X500 Private Credentials in a
 * <i>Subject</i>.
 *
 * <h2>Package Specification</h2>
 *
 * <ul>
 *   <li><a href="https://tools.ietf.org/html/rfc1779">
 *     RFC 1779: A String Representation of Distinguished Names</a></li>
 *   <li><a href="https://tools.ietf.org/html/rfc2253">
 *     RFC 2253: Lightweight Directory Access Protocol (v3):
 *     UTF-8 String Representation of Distinguished Names</a></li>
 *   <li><a href="https://tools.ietf.org/html/rfc5280">
 *     RFC 5280: Internet X.509 Public Key Infrastructure
 *     Certificate and Certificate Revocation List (CRL) Profile</a></li>
 *   <li><a href="https://tools.ietf.org/html/rfc4512">
 *     RFC 4512: Lightweight Directory Access Protocol (LDAP):
 *     Directory Information Models</a></li>
 * </ul>
 *
 * @spec https://www.rfc-editor.org/info/rfc1779
 *      RFC 1779: A String Representation of Distinguished Names
 * @spec https://www.rfc-editor.org/info/rfc2253
 *      RFC 2253: Lightweight Directory Access Protocol (v3):
 *              UTF-8 String Representation of Distinguished Names
 * @spec https://www.rfc-editor.org/info/rfc4512
 *      RFC 4512: Lightweight Directory Access Protocol (LDAP):
 *              Directory Information Models
 * @spec https://www.rfc-editor.org/info/rfc5280
 *      RFC 5280: Internet X.509 Public Key Infrastructure Certificate
 *              and Certificate Revocation List (CRL) Profile
 * @since 1.4
 */
package javax.security.auth.x500;
