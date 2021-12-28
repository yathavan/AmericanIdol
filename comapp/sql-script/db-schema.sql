--
-- PostgreSQL database dump
--

-- Dumped from database version 14.1
-- Dumped by pg_dump version 14.1

-- Started on 2021-12-28 12:38:30 +0530

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 216 (class 1259 OID 16426)
-- Name: additional_info; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.additional_info (
    additional_info_id bigint NOT NULL,
    description character varying(255),
    response_id bigint NOT NULL
);


ALTER TABLE public.additional_info OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16425)
-- Name: additional_info_additional_info_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.additional_info_additional_info_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.additional_info_additional_info_id_seq OWNER TO postgres;

--
-- TOC entry 3612 (class 0 OID 0)
-- Dependencies: 215
-- Name: additional_info_additional_info_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.additional_info_additional_info_id_seq OWNED BY public.additional_info.additional_info_id;


--
-- TOC entry 210 (class 1259 OID 16400)
-- Name: category; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.category (
    category_id bigint NOT NULL,
    name character varying(255)
);


ALTER TABLE public.category OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 16399)
-- Name: category_category_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.category_category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.category_category_id_seq OWNER TO postgres;

--
-- TOC entry 3613 (class 0 OID 0)
-- Dependencies: 209
-- Name: category_category_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.category_category_id_seq OWNED BY public.category.category_id;


--
-- TOC entry 212 (class 1259 OID 16407)
-- Name: item; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.item (
    item_id bigint NOT NULL,
    name character varying(255),
    category_id bigint NOT NULL
);


ALTER TABLE public.item OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 16406)
-- Name: item_item_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.item_item_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.item_item_id_seq OWNER TO postgres;

--
-- TOC entry 3614 (class 0 OID 0)
-- Dependencies: 211
-- Name: item_item_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.item_item_id_seq OWNED BY public.item.item_id;


--
-- TOC entry 214 (class 1259 OID 16414)
-- Name: response; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.response (
    response_id bigint NOT NULL,
    description character varying(255),
    item_id bigint NOT NULL
);


ALTER TABLE public.response OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 16413)
-- Name: response_response_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.response_response_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.response_response_id_seq OWNER TO postgres;

--
-- TOC entry 3615 (class 0 OID 0)
-- Dependencies: 213
-- Name: response_response_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.response_response_id_seq OWNED BY public.response.response_id;


--
-- TOC entry 3448 (class 2604 OID 16429)
-- Name: additional_info additional_info_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.additional_info ALTER COLUMN additional_info_id SET DEFAULT nextval('public.additional_info_additional_info_id_seq'::regclass);


--
-- TOC entry 3445 (class 2604 OID 16403)
-- Name: category category_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category ALTER COLUMN category_id SET DEFAULT nextval('public.category_category_id_seq'::regclass);


--
-- TOC entry 3446 (class 2604 OID 16410)
-- Name: item item_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.item ALTER COLUMN item_id SET DEFAULT nextval('public.item_item_id_seq'::regclass);


--
-- TOC entry 3447 (class 2604 OID 16417)
-- Name: response response_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.response ALTER COLUMN response_id SET DEFAULT nextval('public.response_response_id_seq'::regclass);


--
-- TOC entry 3606 (class 0 OID 16426)
-- Dependencies: 216
-- Data for Name: additional_info; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.additional_info (additional_info_id, description, response_id) FROM stdin;
\.


--
-- TOC entry 3600 (class 0 OID 16400)
-- Dependencies: 210
-- Data for Name: category; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.category (category_id, name) FROM stdin;
\.


--
-- TOC entry 3602 (class 0 OID 16407)
-- Dependencies: 212
-- Data for Name: item; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.item (item_id, name, category_id) FROM stdin;
\.


--
-- TOC entry 3604 (class 0 OID 16414)
-- Dependencies: 214
-- Data for Name: response; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.response (response_id, description, item_id) FROM stdin;
\.


--
-- TOC entry 3616 (class 0 OID 0)
-- Dependencies: 215
-- Name: additional_info_additional_info_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.additional_info_additional_info_id_seq', 1, false);


--
-- TOC entry 3617 (class 0 OID 0)
-- Dependencies: 209
-- Name: category_category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.category_category_id_seq', 1, false);


--
-- TOC entry 3618 (class 0 OID 0)
-- Dependencies: 211
-- Name: item_item_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.item_item_id_seq', 1, false);


--
-- TOC entry 3619 (class 0 OID 0)
-- Dependencies: 213
-- Name: response_response_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.response_response_id_seq', 1, false);


--
-- TOC entry 3456 (class 2606 OID 16431)
-- Name: additional_info additional_info_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.additional_info
    ADD CONSTRAINT additional_info_pkey PRIMARY KEY (additional_info_id);


--
-- TOC entry 3450 (class 2606 OID 16405)
-- Name: category category_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_pkey PRIMARY KEY (category_id);


--
-- TOC entry 3452 (class 2606 OID 16412)
-- Name: item item_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.item
    ADD CONSTRAINT item_pkey PRIMARY KEY (item_id);


--
-- TOC entry 3454 (class 2606 OID 16419)
-- Name: response response_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.response
    ADD CONSTRAINT response_pkey PRIMARY KEY (response_id);


--
-- TOC entry 3457 (class 2606 OID 16420)
-- Name: item fk2n9w8d0dp4bsfra9dcg0046l4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.item
    ADD CONSTRAINT fk2n9w8d0dp4bsfra9dcg0046l4 FOREIGN KEY (category_id) REFERENCES public.category(category_id);


--
-- TOC entry 3458 (class 2606 OID 16437)
-- Name: response fkm2b20n7s5ay2fbg5y4dkuxqve; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.response
    ADD CONSTRAINT fkm2b20n7s5ay2fbg5y4dkuxqve FOREIGN KEY (item_id) REFERENCES public.item(item_id);


--
-- TOC entry 3459 (class 2606 OID 16432)
-- Name: additional_info fkpwokchp7n4lts6loipwc9cu5r; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.additional_info
    ADD CONSTRAINT fkpwokchp7n4lts6loipwc9cu5r FOREIGN KEY (response_id) REFERENCES public.response(response_id);


-- Completed on 2021-12-28 12:38:30 +0530

--
-- PostgreSQL database dump complete
--

